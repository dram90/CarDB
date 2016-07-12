package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Comparator;

/**
 * Created by professor on 11/07/2016.
 */

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private Integer yearOfFab;
    private String plateNumber;
    private double price;

    public Car(long id, String brand, String model, Integer yearOfFab, String plateNumber, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfFab = yearOfFab;
        this.plateNumber = plateNumber;
        this.price=price;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfFab() {
        return yearOfFab;
    }

    public void setYearOfFab(Integer yearOfFab) {
        this.yearOfFab = yearOfFab;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        plateNumber = plateNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfFab=" + yearOfFab +
                ", plateNumber='" + plateNumber + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Car anotherCar){

        // System.out.println("Comparing the following two cars: ");
        // System.out.println(this);
        // System.out.println(anotherCar);
        return this.plateNumber.compareTo(anotherCar.plateNumber);
    }

}

/*class CarComparatorByYear implements Comparator<Car>
{
    @Override
    public int compare(Car car, Car anotherCar)
    {
        if(car.getYearOfFab() > anotherCar.getYearOfFab())
        {
            return 1;
        }
        else if (car.getYearOfFab() < anotherCar.getYearOfFab())
        {
            return -1;
        }
        else return 0;
    }

}*/
