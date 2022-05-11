package ua.lviv.iot.labs;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.lviv.iot.labs.RemoveText;

public class RemoveTextTest {
    @Test
    public void mainTest () throws Exception {
        RemoveText removetext = new RemoveText();
        String expected = "commonly use prepositions to show relationship space time logical relationship between two more people, places things. Prepositions  most commonly followed by noun phrase pronoun (underlined):last time I saw him he was walking down road. most useful preposition : and others.";
        String actual = "commonly use prepositions to show relationship space time logical relationship between two more people, places things. Prepositions  most commonly followed by noun phrase pronoun (underlined):last time I saw him he was walking down road. most useful preposition : and others.";
        Assertions.assertFalse(expected.isEmpty());
        Assertions.assertEquals(expected, actual);

    }
}

