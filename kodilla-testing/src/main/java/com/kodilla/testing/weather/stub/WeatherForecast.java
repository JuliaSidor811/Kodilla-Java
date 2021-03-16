package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAvg() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedian() {
        List<Double> tempValues = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempValues.add(temperature.getValue());
        }

        Collections.sort(tempValues);

        if (tempValues.size() % 2 != 0) {
            return tempValues.get(tempValues.size() / 2);

        } else {
            return (tempValues.get(tempValues.size() / 2) + tempValues.get((tempValues.size() / 2) - 1)) / 2;
        }
    }

}
