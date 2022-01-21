# spring-boot-debezium-db-kafka

Spring-Boot-Debezium-Kafka-PostgreSQL Relationship

## Installation

- First,Configure docker-compose.yml
- Second,Write Db-Kafka configuration to json file.
- Third,Designed .sh file for DB-Kafka configuration file and Kafka-Connector 


## Using

- First,docker-compose up -d
- Second
```shell
  sh connectionCommand.sh
```


![DebeziumCommand sh file](https://user-images.githubusercontent.com/80245013/150528960-a908c9fb-7b1d-41d1-b948-7f4726fd403a.PNG)


- Third,
Get Kafka-Drop and Looking heatbeat connection


![KafkaDrop](https://user-images.githubusercontent.com/80245013/150528989-2c9bbfbd-6d55-43b6-a58b-14e6eb0c2f8c.PNG)



- Fourth,Open Spring Boot Project and Post a Request 


![image](https://user-images.githubusercontent.com/80245013/150529063-58623030-3c2b-4404-a6c0-fd61a41cb6db.png)


- Fifth,Get Kafka-Drop and Lookind our cdc connection


![image](https://user-images.githubusercontent.com/80245013/150529122-9b2fa65b-ed91-4dcf-a8c7-02fd4f008aad.png)


- Sixth Click our cdc connection topics and looking View Messages


![image](https://user-images.githubusercontent.com/80245013/150529174-94454b51-9102-4a4b-abd9-24a6ae38e69d.png)


- If we do not want to see null in the Update request, we enter this command
  
  ALTER TABLE public.vehicles REPLICA IDENTITY FULL



[Muharrem Koç](https://github.com/muharremkoc)
