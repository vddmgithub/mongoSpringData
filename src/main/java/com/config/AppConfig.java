package com.config;

import com.dao.CarDao;
import com.dao.CarDaoImpl;
import com.mongodb.MongoClient;
import com.service.CarService;
import com.service.CarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class AppConfig {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception{
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        UserCredentials userCredentials = new UserCredentials("", "");
        return new SimpleMongoDbFactory(mongoClient, "technicalkeeda", userCredentials);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }

    @Bean
    public CarService carService(){
        return new CarServiceImpl();
    }

    @Bean
    public CarDao carDao(){
        return new CarDaoImpl();
    }
}
