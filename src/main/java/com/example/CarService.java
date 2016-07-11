package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by professor on 11/07/2016.
 */

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void testCars(){

        Car car1= new Car(1L,"Jaguar","TheRoadIsYours",2016,"1234ENG", 1999999);
        carRepository.save(car1);
        Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065AME", 398542);
        carRepository.save(car2);
        Car car3= new Car (3L,"Lexus","FastAndGlorious",2016,"5638DDD",2431546);
        carRepository.save(car3);
        Car car4= new Car (4L,"Austin","BeLikeBond",2015,"3564GER",6544546);
        carRepository.save(car4);
        Car car5= new Car (5L,"RomeoAlfaJulietta","DramaMasterpiece",2013,"4749JAV",764563);
        carRepository.save(car5);
        Car car6= new Car (6L,"BMW","LoveAtFirstDrive",2014,"9065AND", 390042);
        carRepository.save(car6);
        Car car7= new Car(7L,"Jaguar","TheRoadIsYours",2015,"1235ENG", 1999943);
        carRepository.save(car7);
        Car car8= new Car (8L,"BMW","LoveAtFirstDrive",2014,"9065AME", 100);
        carRepository.save(car8);


        System.out.println("Cars made since 2016 ");
        System.out.println(carRepository.findByYearOfFabGreaterThanEqual(2016));

        System.out.println("Cars made before 2014 ");
        System.out.println(carRepository.findByYearOfFabLessThan(2016));


        System.out.println("Cars made between 2014 and 2016");
        System.out.println(carRepository.findByYearOfFabBetween(2014,2016));

        System.out.println("Cars that cost more than 1000000");
        System.out.println(carRepository.findByPriceGreaterThanEqual(1000000));

        System.out.println("Cars that cost between 760000 and 6000000 ");
        System.out.println(carRepository.findByPriceBetween(760000,6000000));

        System.out.println("Car with plate number 1234ENG ");
        System.out.println(carRepository.findByPlateNumber("1234ENG"));

        System.out.println("Cars of brand Jaguar and model TheRoadIsYours");
        System.out.println(carRepository.findByBrandAndModel("Jaguar", "TheRoadIsYours"));

        System.out.println("Cars of brand BMW and price less than 10000");
        System.out.println(carRepository.findByBrandAndPrice("BMW",10000));

        System.out.println("Cars of brand Lexus, model FastAndGlorious that cost more than 2400000 ");
        System.out.println(carRepository.findByBrandAndModelAndPriceGreaterThanEqual("Lexus","FastAndGlorious",2400000));

        List<Car> carList = carRepository.findByBrand("BMW");

        int sum=0;
        int numCars=0;
        for(Car car : carList)
        {
            numCars++;
            sum=sum+car.getPrice();
        }

        int average= sum/numCars;

        System.out.println("The average price all of BMW cars is: " +average);










    }
}
