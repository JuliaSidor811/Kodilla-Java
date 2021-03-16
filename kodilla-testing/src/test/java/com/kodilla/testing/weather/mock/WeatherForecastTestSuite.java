package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.validateMockitoUsage;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private static Map<String, Double> temperaturesMap = new HashMap<>();
    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    static void beforeAll() {

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

    }

    @BeforeEach
    void beforeEach() {
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAvgWithMock() {

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double avg = weatherForecast.calculateAvg();

        Assertions.assertEquals(25.56, avg);


    }

    @Test
    void testCalculateMedianWithMock() {

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double median = weatherForecast.calculateMedian();

        Assertions.assertEquals(25.5, median);


    }


}
