package ua.lviv.iot.Labs.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.model.Bus;
import ua.lviv.iot.labs.model.Engine;
import ua.lviv.iot.labs.model.Standart;

public class BusTest  {

    @Test
    public void testToString () {
        Bus bus = new Bus("Mercedec", "Sprinter", "bus",
                Standart.EURO_6, Engine.PETROL, 2021, 24000, 3.4);

        String expected = "name=Mercedec, model=Sprinter, category=bus, standart=EURO_6, engine=PETROL, " +
                "yearOfManufacture=2021, price=24000, engineCapacity=3.4";

        Assertions.assertEquals(expected, bus.toString());
    }
}