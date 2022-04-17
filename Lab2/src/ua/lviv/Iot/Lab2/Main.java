package ua.lviv.Iot.Lab2;

public class Main {

    public static void main(String[] args) {
        Truck Truck1 = new Truck("Scania", "xl400", "truck",
                "euro-6", "disel", 2020, 50000, 6.4);
        Bus Bus1 = new Bus("Mercedec", "Sprinter", "bus",
                "euro-5", "disel", 2021, 25000, 3.4);
        Minivan Minivan1 = new Minivan("Mercedec", "Vito", "minivan",
                "euro-5", "petrol", 2020, 25000, 2.0);
        Auto Auto1 = new Auto("Mercedec", "gle:400", "auto",
                "euro-6", "petrol", 2019, 15000, 1.6);
        System.out.println("Used Cars:");
        System.out.println(Truck1.toString());
        System.out.println(Bus1.toString());
        System.out.println(Minivan1.toString());
        System.out.println(Auto1.toString());
    }
}
