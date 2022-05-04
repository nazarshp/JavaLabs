package ua.lviv.iot.Labs.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.model.Engine;
import ua.lviv.iot.labs.model.Standart;
import ua.lviv.iot.labs.model.Truck;

public class TruckTest {

    @Test
    public void testToString () {
        Truck truck = new Truck("Scania", "s400", "truck",
                Standart.EURO_5, Engine.DIESEL, 2015, 50000, 6.4);

        String expected = "name=Scania, model=s400, category=truck, standart=EURO_5, engine=DIESEL, " +
                "yearOfManufacture=2015, price=50000, engineCapacity=6.4";

        Assertions.assertEquals(expected, truck.toString());
    }
}