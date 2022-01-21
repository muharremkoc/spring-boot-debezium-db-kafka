package com.example.springbootdebeziumdbkafka.service;

import com.example.springbootdebeziumdbkafka.model.Vehicle;
import com.example.springbootdebeziumdbkafka.repository.VehicleRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VehicleServiceImpl implements VehicleService{

    final VehicleRepository vehicleRepository;

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(String vehicleID, Vehicle vehicle) {
        Vehicle currentVehicle=vehicleRepository.findById(vehicleID).orElseThrow();
        currentVehicle.setVehicleModel(vehicle.getVehicleModel());
        currentVehicle.setDamaged(vehicle.isDamaged());
        return vehicleRepository.save(currentVehicle);
    }

    @Override
    public Vehicle getVehicle(String vehicleID) {
        return vehicleRepository.findById(vehicleID).orElseThrow();
    }

    @Override
    public String scrapVehicle(String vehicleID) {
        vehicleRepository.deleteById(vehicleID);
        return "The Vehicle ID's: "+vehicleID+" was scrapped";
    }

    @Override
    public List<Vehicle> allVehicles() {
        return vehicleRepository.findAll();
    }
}
