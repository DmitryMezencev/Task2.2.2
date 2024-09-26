package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car("Nisan", "Red", "V2"));
        cars.add(new Car("Toyota", "Black", "V4"));
        cars.add(new Car("BMW", "Blue", "V6"));
        cars.add(new Car("Mercedes", "White", "V8"));
        cars.add(new Car("Opel", "Yellow", "V12"));
    }

    @Override
    public List<Car> show(Integer count) {
        if (count == null) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
