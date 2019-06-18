package com.example.deliveryPet.services.utility;


import org.springframework.stereotype.Component;




// This class for solving cost by distance and weight. Valid price will be only with weight until 10 killograms

@Component
public class PriceService {

    private final double COEFFICIENT_SHORT = 0.04;
    private final double COEFFICIENT_LONG = 0.2;

    public  int calculationPrice(double distance,int weight){
        int price;
if (distance<50) {
    price = weight * (int) (distance * COEFFICIENT_LONG);
}else {

    price= weight * (int) (distance * COEFFICIENT_SHORT);

}



        return price;
    }

}
