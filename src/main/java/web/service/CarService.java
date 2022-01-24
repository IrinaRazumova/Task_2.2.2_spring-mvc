package web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import web.car.Car;

public class CarService {
    public  static List<Car> getCarList(String count) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Mersedes", "red", "111"));
        carList.add(new Car("BMW", "blue", "222"));
        carList.add(new Car("Volvo", "black", "333"));
        carList.add(new Car("Audi", "yellow", "444"));
        carList.add(new Car("ЗАЗ", "green", "555"));

        return carList.stream().limit(Integer.valueOf(count)).collect(Collectors.toList());
    }
}
