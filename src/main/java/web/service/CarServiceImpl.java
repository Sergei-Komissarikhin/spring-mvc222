package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    CarDaoImpl carDao = new CarDaoImpl();
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
