package Task7.Car;

import java.util.Objects;

public class Car {
    public int id;
    public String brand;
    public String model;
    public String year;

    public Car(int id, String brand, String model, String year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, year);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}