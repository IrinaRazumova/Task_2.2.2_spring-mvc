package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(name = "count", required = false, defaultValue = "5") String count, ModelMap model) {
//        model.addAttribute("carsList", Arrays.asList(
//                new Car("Mersedes", "red", "111"),
//                new Car("BMW", "blue", "222"),
//                new Car("Volvo", "black", "333"),
//                new Car("Audi", "yellow", "444"),
//                new Car("Mashina", "green", "555")
//        ));
        List<Car> carList = CarServiceImpl.getCarList(count);
        model.addAttribute("carsList", carList);
        return "cars";
    }
}

