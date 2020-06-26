package com.service;

import com.domain.Car;

import java.util.List;

public interface CarService {
    public void create(Car car);

    public void update(Car car);

    public void delete(Car car);

    public void deleteAll();

    public Car find(Car car);

    public List< Car > findAll();
}

