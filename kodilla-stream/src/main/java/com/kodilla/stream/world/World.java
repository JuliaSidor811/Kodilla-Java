package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentList.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeople = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }


}
