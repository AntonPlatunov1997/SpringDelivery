package com.example.deliveryPet.services.utility;


import com.example.deliveryPet.model.entity.City;
import org.springframework.stereotype.Component;


//This class for solving destination beetwen two cities

@Component
public class DestionationService {

    public double distFrom(City cityFrom,City cityTo){

        double lat1 = cityFrom.getLatitude();
        double lng1 = cityFrom.getLongitude();

        double lat2 = cityTo.getLatitude();
        double lng2 = cityTo.getLongitude();

       if (lat1 == lat2 & lng1 == lng2) {
           return 20.0;
       } else {

           double earthRadius = 6371000; //meters
           double dLat = Math.toRadians(lat2 - lat1);
           double dLng = Math.toRadians(lng2 - lng1);
           double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                           Math.sin(dLng / 2) * Math.sin(dLng / 2);
           double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
           double dist = (earthRadius * c) / 1000;

           return dist;
       }
   }
}
