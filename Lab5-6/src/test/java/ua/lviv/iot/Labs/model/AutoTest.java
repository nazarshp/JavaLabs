package ua.lviv.iot.Labs.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.model.Auto;
import ua.lviv.iot.labs.model.Car;
import ua.lviv.iot.labs.model.Engine;
import ua.lviv.iot.labs.model.Standart;

public class AutoTest extends Car {

    @Test
    public void testToString () {
        Auto auto = new Auto ("Mercedec", "amg", "auto",
                Standart.EURO_5, Engine.DIESEL, 2020, 21000, 2.0);

        String expected = "name=Mercedec, model=amg, category=auto, standart=EURO_5, engine=DIESEL" +
                ", yearOfManufacture=2020, price=21000, engineCapacity=2.0";

        Assertions.assertEquals(expected, auto.toString());
    }
}
