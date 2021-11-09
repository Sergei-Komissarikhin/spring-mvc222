package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    private List<Car> carList;

     public CarDaoImpl(){
        carList = new ArrayList<>();
        carList.add(new Car("VW", "Polo", "white"));
        carList.add(new Car("AUDI", "A6", "black"));
        carList.add(new Car("BMV", "X3", "yellow"));
        carList.add(new Car("Lada", "Granta", "purple"));
        carList.add(new Car("Tesla", "Model X", "white"));
        carList.add(new Car("UAZ", "Patriot", "green"));
        carList.add(new Car("Mazda", "CX-7", "red"));
        carList.add(new Car("Nissan", "Juke", "brown"));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carList;
        } else {
            List<Car> carsNeeded = carList.stream()
                    .limit(count)
                    .collect(Collectors.toList());
            return carsNeeded;
        }
    }
}
