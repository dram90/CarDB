package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


    public interface CarRepository extends JpaRepository<Car,Long> {

        List<Car> findByYearOfFabGreaterThanEqual(Integer yearOfFab);
        List<Car> findByYearOfFabLessThan(Integer yearOfFab);
        List<Car> findByYearOfFabBetween(Integer min, Integer max);
        List<Car> findByPriceGreaterThanEqual(Integer price);
        List<Car> findByPriceBetween(Integer min, Integer max);
        Car findByPlateNumber(String plateNumber);
        List<Car> findByBrandAndModel(String brand, String model);
        List<Car> findByBrandAndPrice(String brand, Integer price);
        List<Car> findByBrandAndModelAndPriceGreaterThanEqual(String brand, String model, Integer price);
        List<Car> findByBrand(String brand);






    }


