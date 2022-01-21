package com.example.springbootdebeziumdbkafka.service;

import com.example.springbootdebeziumdbkafka.model.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(String vehicleID,Vehicle vehicle);
    Vehicle getVehicle(String vehicleID);
    String scrapVehicle(String vehicleID);
    List<Vehicle> allVehicles();
}
