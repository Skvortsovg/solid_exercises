package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private List<Car> carsDb;

    public CarManager() {
        this.cardDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"),
                                    new Car("2", "Multipla", "Fiat"),
                                    new Car("3", "Megane", "Renault"));
    }

    public Car getFromDb(final String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : this.carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : this.carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
