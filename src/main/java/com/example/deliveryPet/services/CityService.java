package com.example.deliveryPet.services;


import com.example.deliveryPet.model.entity.City;
import com.example.deliveryPet.model.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {


@Autowired
    CityRepository cityRepository;


public List<City> findAllCities(){

    return cityRepository.findAll();
}

public City findCityByName(String name){
    return  cityRepository.findByCityName(name);

}

}
