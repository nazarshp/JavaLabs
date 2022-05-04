package ua.lviv.iot.Labs.manager;

//import ua.lviv.iot.Labs.model.Car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.manager.Manager;
import ua.lviv.iot.labs.model.Car;
import ua.lviv.iot.labs.model.Engine;
import ua.lviv.iot.labs.model.Standart;
import ua.lviv.iot.labs.model.Truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerTest {

    static  List<Car> list = new ArrayList<>();
    @BeforeAll
    public static void createListCar ()
    {
        Truck Truck1 = new Truck("Scania", "s400", "truck",
                Standart.EURO_5, Engine.DIESEL, 2015, 50000, 6.4);
        Truck Truck2 = new Truck("Mercedec", "Actros", "truck",
                Standart.EURO_6, Engine.DIESEL, 2019, 45000, 6.0);
        Truck Truck3 = new Truck("Volvo", "FH", "truck",
                Standart.EURO_5, Engine.PETROL, 2018, 55000, 6.2);
        list= Arrays.asList(Truck1, Truck2,Truck3);
    }
    @Test
    public void testSortByPriceAsc() {
        Manager manager = new Manager();
        List<Car> expected = Arrays.asList(list.get(1), list.get(0), list.get(2));
        Assertions.assertEquals(expected, manager.sortByPriceAsc(list));
    }
    @Test
    public void testSortByPriceDesc() {
        Manager manager = new Manager();
        List<Car> expected = Arrays.asList(list.get(2), list.get(0), list.get(1));
        Assertions.assertEquals(expected, manager.sortByPriceDesc(list));
    }
    @Test
    public void testSortByYearOfManufactureAsc() {
        Manager manager = new Manager();
        List<Car> expected = Arrays.asList(list.get(0), list.get(2), list.get(1));
        Assertions.assertEquals(expected, manager.sortyearOfManufactureAsc(list));
    }
    @Test
    public void testSortByYearOfManufactureDesc() {
        Manager manager = new Manager();
        List<Car> expected = Arrays.asList(list.get(1), list.get(2), list.get(0));
        Assertions.assertEquals(expected, manager.sortyearOfManufactureDesc(list));
    }
}
