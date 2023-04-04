package com.driver.repository;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository

public class AirportRepository {
    HashMap<String, Airport> DbAirport=new HashMap<>();

    HashMap<Integer, Flight> DbFlight=new HashMap<>();
    HashMap<Integer, Passenger> DbPassenger=new HashMap<>();


    public String addAirport(Airport airport){
            String key= airport.getAirportName();
            DbAirport.put(key,airport);

        //Return a String message "SUCCESS"

        return "SUCCESS";
    }

}
