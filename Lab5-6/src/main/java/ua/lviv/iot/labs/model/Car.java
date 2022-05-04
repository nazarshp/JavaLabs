package ua.lviv.iot.labs.model;

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

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public Standart getStandart() {
        return standart;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStandart(Standart standart) {
        this.standart = standart;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getHeader() {
        return "name; model; category; standart; engine; yearOfManufacture; price; engineCapacity";
    }

    public String toCSV() {
        return String.format("%s; %s; %s; %s; %s; %d; %d; %f", getName(), getModel(), getCategory(), getStandart(),
                getEngine(), getYearOfManufacture(),getPrice(), getEngineCapacity());
    }
}

