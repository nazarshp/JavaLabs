package ua.lviv.Iot.Lab2;

public class Car {
    private String name;
    private String model;
    private String category;
    private String standart;
    private String engine;
    private int yearOfManufacture;
    private int price;
    private double engineCapacity;

    public Car(String name, String model, String category, String standart,
               String engine, int yearOfManufacture, int price, double engineCapacity) {
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