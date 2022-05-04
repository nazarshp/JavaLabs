package ua.lviv.iot.Labs.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.model.Engine;
import ua.lviv.iot.labs.model.Minivan;
import ua.lviv.iot.labs.model.Standart;

public class MinivanTest  {

        @Test
        public void testToString () {
           Minivan minivan = new Minivan("Mercedec", "Vito", "minivan",
                   Standart.EURO_6, Engine.DIESEL, 2009, 25000, 2.0);

            String expected = "name=Mercedec, model=Vito, category=minivan, standart=EURO_6, engine=DIESEL, " +
                    "yearOfManufacture=2009, price=25000, engineCapacity=2.0";

            Assertions.assertEquals(expected, minivan.toString());
        }
}
