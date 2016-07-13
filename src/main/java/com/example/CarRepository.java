package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.support.DomainClassConverter;

import javax.persistence.Table;
import java.lang.reflect.Array;
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
        List<Car> findByOwner(Person owner);


        //En JPQL

        @Query("SELECT AVG(car.price) from Car car WHERE car.brand = :Lexus ")
        Double findAveragePerBrand(@Param("Lexus")String brand);

        @Query("SELECT car FROM Car car WHERE car.owner = :Owner")
        List<Car> findCarByOwner(@Param("Owner")Person owner);

        @Query("SELECT car FROM Car car WHERE car.owner =:owner AND car.price >=:price")
        List <Car> findCarByOwnerAndPriceGreaterThan(
                @Param("owner")Person owner,
                @Param("price") Double price);

        @Query("SELECT car FROM Car car WHERE car.owner =:owner AND car.price >=:price AND car.yearOfFab  between :minYear and :maxYear")
       List <Car> findCarByOwnerAndPriceAndRangeYearOFFab (
                @Param("owner") Person owner,
                @Param("price") Double price,
                @Param("minYear") Integer minYear,
                @Param("maxYear") Integer maxYear );

        @Query ("SELECT car FROM Car car WHERE car.owner.age >=:age")
        List<Car> findCarListWithOwnersOlderThan(@Param("age") Integer age);

        @Query ("SELECT car FROM Car car WHERE car.owner.age between :minAge and :maxAge")
        List<Car> findCarListWithOwnersAgeBetween(
                @Param("minAge") Integer minAge,
                @Param("maxAge") Integer maxAge);

       @Query ("SELECT car FROM Car car WHERE car.plateNumber LIKE CONCAT('%',:plateNumberPart,'%')")
        List<Car> findCarByPlateNumberSubstring (@Param("plateNumberPart") String plateNumberPart);

       //Forma2. Con Spring Data Query

        List<Car> findByPlateNumberContains(String plateNumberPart);

        @Query ("SELECT car.brand, AVG(car.price), MIN(car.price), MAX(car.price) FROM Car car GROUP BY car.brand")
        List <Object[]>  AvgAndMaxAndMinPricesPerBrand();


        @Query("SELECT car.yearOfFab, COUNT(car) FROM Car car GROUP BY car.yearOfFab")
        List <Object[]> CarsMadeByYear();

    }


