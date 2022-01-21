package com.example.springbootdebeziumdbkafka.repository;

import com.example.springbootdebeziumdbkafka.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}
