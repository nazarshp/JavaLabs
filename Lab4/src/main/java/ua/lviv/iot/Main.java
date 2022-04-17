package ua.lviv.iot;
import ua.lviv.iot.labs.manager.Manager;
import ua.lviv.iot.labs.model.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Truck Truck1 = new Truck("Scania", "s400", "truck",
                Standart.EURO_5, Engine.DIESEL, 2015, 50000, 6.4);
        Truck Truck2 = new Truck("Mercedec", "Actros", "truck",
                Standart.EURO_6, Engine.DIESEL, 2019, 45000, 6.0);
        Truck Truck3 = new Truck("Volvo", "FH", "truck",
                Standart.EURO_5, Engine.PETROL, 2018, 55000, 6.2);
        Bus Bus1 = new Bus("Mercedec", "Sprinter", "bus",
                Standart.EURO_6, Engine.PETROL, 2021, 24000, 3.4);
        Bus Bus2 = new Bus("Volkswagen", "Crafter", "bus",
                Standart.EURO_5, Engine.DIESEL, 2020, 20000, 3.0);
        Bus Bus3 = new Bus("Renault", "Master", "bus",
                Standart.EURO_6, Engine.PETROL, 2016, 18000, 3.2);
        Minivan Minivan1 = new Minivan("Mercedec", "Vito", "minivan",
                Standart.EURO_6, Engine.DIESEL, 2009, 25000, 2.0);
        Minivan Minivan2 = new Minivan("Volkswagen", "Transporter", "minivan",
                Standart.EURO_5, Engine.DIESEL, 2017, 20000, 2.0);
        Minivan Minivan3 = new Minivan("Renault", "Trafic", "minivan",
                Standart.EURO_6, Engine.PETROL, 2018, 15000, 2.4);
        Auto Auto1 = new Auto("Mercedec", "amg", "auto",
                Standart.EURO_5, Engine.DIESEL, 2020, 21000, 2.0);
        Auto Auto2 = new Auto("Bmw", "m5", "auto",
                Standart.EURO_5, Engine.PETROL, 2021, 26000, 2.2);
        Auto Auto3 = new Auto("Volkswagen", "jetta", "auto",
                Standart.EURO_6, Engine.DIESEL, 2016, 16000, 1.9);

        ArrayList<Car> UsedCars = new ArrayList<>();
        UsedCars.add(Truck1);
        UsedCars.add(Truck2);
        UsedCars.add(Truck3);
        UsedCars.add(Bus1);
        UsedCars.add(Bus2);
        UsedCars.add(Bus3);
        UsedCars.add(Minivan1);
        UsedCars.add(Minivan2);
        UsedCars.add(Minivan3);
        UsedCars.add(Auto1);
        UsedCars.add(Auto2);
        UsedCars.add(Auto3);
        Manager myManager = new Manager();
        System.out.println("Sort prise asc:");
        myManager.sortByPricetAsc(UsedCars);
        System.out.println("Sort prise desc:");
        myManager.sortByPricetDesc(UsedCars);
        System.out.println("Sort yearOfManufacture asc:");
        myManager.sortyearOfManufactureAsc(UsedCars);
        System.out.println("Sort yearOfManufacture desc:");
        myManager.sortyearOfManufactureDesc(UsedCars);
    }
}