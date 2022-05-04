package ua.lviv.iot.labs.writer;

import ua.lviv.iot.labs.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Writer {
    public  static  void writeToFile(List<Car>carList, String fileName) throws IOException {
        String separator = File.separator;

        try (FileWriter fileWriter = new FileWriter("src" + separator + "test" + separator + "resources" + separator + fileName)) {

            Collections.sort(carList, Comparator.comparing(o -> o.getClass().getSimpleName()));

            String previousClassName = "";

            for (Car car : carList) {
                if (!car.getClass().getSimpleName().equals(previousClassName)) {
                    fileWriter.write(car.getClass().getSimpleName() + "s:");
                    fileWriter.write("\n");
                    fileWriter.write(car.getHeader());
                    fileWriter.write("\n");
                    previousClassName = car.getClass().getSimpleName();
                }

                fileWriter.write(car.toCSV());
                fileWriter.write("\n");
            }
        }


    }

}
