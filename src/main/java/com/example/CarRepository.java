package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.support.DomainClassConverter;

import java.util.List;


    public interface CarRepository extends JpaRepository<Car,Long> {

        List<Car> findByYearOfFabGreaterThanEqual(Integer yearOfFab);
        List<Car> findByYearOfFabLessThan(Integer yearOfFab);
        List<Car> findByYearOfFabBetween(Integer min, Integer max);
        List<Car> findByPriceGreaterThanEqual(Double price);
        List<Car> findByPriceBetween(Double min, Double max);
        Car findByPlateNumber(String plateNumber);
        List<Car> findByBrandAndModel(String brand, String model);
        List<Car> findByBrandAndPrice(String brand, Double price);
        List<Car> findByBrandAndModelAndPriceGreaterThanEqual(String brand, String model, Double price);
        List<Car> findByBrand(String brand);

        @Query("SELECT AVG(car.price) from Car car WHERE car.brand = :Lexus ")
        Double findAveragePerBrand(@Param("Lexus")String brand);






    }


