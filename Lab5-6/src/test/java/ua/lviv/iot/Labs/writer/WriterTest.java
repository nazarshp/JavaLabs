package ua.lviv.iot.Labs.writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.model.*;
import ua.lviv.iot.labs.writer.Writer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class WriterTest {
   public static final String separator = File.separator;
   public static List<Car> emptyList;
   public static List<Car> CarList1;
   public static List<Car> CarList2;

   @BeforeAll
   public static void createCarList() throws IOException {
       Truck Truck1 = new Truck("Scania", "s400", "truck",
               Standart.EURO_5, Engine.DIESEL, 2015, 50000, 6.4);
       Bus Bus1 = new Bus("Mercedec", "Sprinter", "bus",
               Standart.EURO_6, Engine.PETROL, 2021, 24000, 3.4);
       Minivan Minivan1 = new Minivan("Mercedec", "Vito", "minivan",
               Standart.EURO_6, Engine.DIESEL, 2009, 25000, 2.0);
       Auto Auto1 = new Auto("Mercedec", "amg", "auto",
               Standart.EURO_5, Engine.DIESEL, 2020, 21000, 2.0);

       emptyList = Arrays.asList();
       CarList1 = Arrays.asList(Truck1, Bus1, Minivan1, Auto1);
       CarList2 = Arrays.asList(Truck1, Minivan1, Auto1);
   }
   @Test
    public void testWriteEmptyfile() throws IOException {
       Writer.writeToFile(emptyList, "actualEmptyFile.csv");

       List<String> expectedFile = Files.readAllLines(Path.of("expectedEmptyFile.csv"));
       List<String> actualFile = Files.readAllLines(Path.of("src"+separator+"test"+separator+
               "resources"+separator+"actualEmptyFile.csv"));
       Assertions.assertEquals(expectedFile, actualFile);
   }
   @Test
   public void testWriteAllCarToFile() throws IOException {
       Writer.writeToFile(CarList1, "actualListFile1.csv");

       List<String> expectedFile = Files.readAllLines(Path.of("expectedListFile1.csv"));
       List<String> actualFile = Files.readAllLines(Path.of("src" + separator + "test" + separator +
               "resources" + separator + "actualListFile1.csv"));
       Assertions.assertEquals(expectedFile, actualFile);
   }
   @Test
       public void testWriteDieselCarToFile() throws IOException {
           Writer.writeToFile(CarList2, "actualListFile2.csv");

           List<String> expectedFile = Files.readAllLines(Path.of("expectedListFile2.csv"));
           List<String> actualFile = Files.readAllLines(Path.of("src"+separator+"test"+separator+
                   "resources"+separator+"actualListFile2.csv"));
           Assertions.assertEquals(expectedFile, actualFile);
   }

}
