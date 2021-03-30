package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.util.HashMap;


public class FlightRunner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean> possibleFlights = new HashMap<>();

        possibleFlights.put("Warsaw", true);
        possibleFlights.put("Berlin", false);
        possibleFlights.put("Seul", true);
        possibleFlights.put("Paris", false);

        boolean isPossible = possibleFlights.containsKey(flight.getArrivalAirport());
        if(!isPossible){
            throw new RouteNotFoundException("Nie ma takiego lotu");
        }
        return possibleFlights.get(flight.getArrivalAirport());

    }

    public static void main(String[] args){
        FlightRunner flightRunner = new FlightRunner();
        Flight flight = new Flight("Warsaw","Seul");
        boolean result = false;
        try{
            result = flightRunner.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("Blad wyszukiwania");
        }
        finally {
            System.out.println(result);
        }

    }
}
