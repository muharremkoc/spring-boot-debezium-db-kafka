package com.example.springbootdebeziumdbkafka.consumer;

import com.example.springbootdebeziumdbkafka.model.Vehicle;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VehicleConsumer {

    final ObjectMapper objectMapper;

    @KafkaListener(topics = "data.cdc.vehicledb")
    public void consumeVehicle(ConsumerRecord<String, String> record) throws JsonProcessingException {
        String consumedValue = record.value();

        var jsonNode = objectMapper.readTree(consumedValue);
        JsonNode payload = jsonNode.path("payload");
        JsonNode after = payload.path("after");

        String vehicleString = after.toString();
        Vehicle vehicle = objectMapper.readValue(vehicleString, Vehicle.class);
    }
}
