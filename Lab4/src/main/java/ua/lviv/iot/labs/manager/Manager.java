package ua.lviv.iot.labs.manager;

//import ua.lviv.Iot.Lab3.model.Car;

import ua.lviv.iot.labs.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Manager {

    public List<Car> sortByPricetAsc (List<Car> list) {

        return list.stream()
                .sorted(java.util.Comparator.comparing(Car::getPrice))
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
    public List<Car> sortByPricetDesc (List<Car> list) {

        return list.stream()
                .sorted(java.util.Comparator.comparing(Car::getPrice).reversed())
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
    public List<Car> sortyearOfManufactureAsc (List<Car> list) {

        return list.stream()
                .sorted(java.util.Comparator.comparing(Car::getYearOfManufacture))
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
    public List<Car> sortyearOfManufactureDesc (List<Car> list) {

        return list.stream()
                .sorted(java.util.Comparator.comparing(Car::getYearOfManufacture).reversed())
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
}
