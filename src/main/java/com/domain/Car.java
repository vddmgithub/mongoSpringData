package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private String id;
    private String brand;
    private String model;

    public Car(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Brand:- " + getBrand() + ", Model:- " + getModel());
        return str.toString();
    }
}
