package web.service;

import web.controller.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl /* implements CarService */{
//    @Override
    public  static List<Car> getCarList(String count) {
        Car c1 = new Car("Mersedes", "red", "111");
        Car c2 = new Car("BMW", "blue", "222");
        Car c3 = new Car("Volvo", "black", "333");
        Car c4 = new Car("Audi", "yellow", "444");
        Car c5 = new Car("Mashina", "green", "555");

        List<Car> carList = new ArrayList<>();
        switch (count) {
            case ("1"):
                carList.add(c1);
                break;
            case ("2"):
                carList.add(c1);
                carList.add(c2);
                break;
            case ("3"):
                carList.add(c1);
                carList.add(c2);
                carList.add(c3);
                break;
            case ("4"):
                carList.add(c1);
                carList.add(c2);
                carList.add(c3);
                carList.add(c4);
                break;
            default:
                carList.add(c1);
                carList.add(c2);
                carList.add(c3);
                carList.add(c4);
                carList.add(c5);
                break;
        }

        return carList;
    }
}
