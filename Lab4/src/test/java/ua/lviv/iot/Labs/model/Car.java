package ua.lviv.iot.Labs.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {
    private String name;
    private String model;
    private String category;
    private Standart standart;
    private Engine engine;
    private int yearOfManufacture;
    private int price;
    private double engineCapacity;

    public Car(String name, String model, String category, Standart standart,
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

    public Car() {
    }
}

