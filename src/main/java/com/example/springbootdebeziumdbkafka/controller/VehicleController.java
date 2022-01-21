package com.example.springbootdebeziumdbkafka.controller;

import com.example.springbootdebeziumdbkafka.model.Vehicle;
import com.example.springbootdebeziumdbkafka.service.VehicleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/debezium")
public class VehicleController {

    final VehicleService vehicleService;

    @PostMapping("/vehicle/save")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.createVehicle(vehicle);
    }

    @PutMapping("/vehicle/update/{vehicleID}")
    public Vehicle updateVehicle(@PathVariable("vehicleID") String vehicleID,@RequestBody Vehicle vehicle){
        return vehicleService.updateVehicle(vehicleID, vehicle);
    }

    @GetMapping("/vehicle/select/{vehicleID}")
    public Vehicle selectVehicle(@PathVariable("vehicleID") String vehicleID){
        return vehicleService.getVehicle(vehicleID);
    }
    @DeleteMapping("/vehicle/select/{vehicleID}")
    public String scrapVehicle(@PathVariable("vehicleID") String vehicleID){
        return vehicleService.scrapVehicle(vehicleID);
    }
    @GetMapping("/vehicle/select/allVehicles")
    public List<Vehicle> selectAllVehicles(){
        return vehicleService.allVehicles();
    }
}
