package ua.lviv.iot.labs.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Minivan extends Car {
    public String name;
    private String model;
    private String category;
    private Standart standart;
    private Engine engine;
    private int yearOfManufacture;
    private int price;
    private double engineCapacity;


    public Minivan(

            String name, String model, String category, Standart standart,

            Engine engine, int yearOfManufacture, int price, double engineCapacity) {
        this.name = name;
        this.model = model;
        this.category = category;
        this.standart = standart;
        this.engine = engine;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "name=" + name + ", model=" + model + ", category=" + category +
                ", standart=" + standart + ", engine=" + engine + ", yearOfManufacture=" + yearOfManufacture + ", price=" + price +
                ", engineCapacity=" + engineCapacity;
    }
}
