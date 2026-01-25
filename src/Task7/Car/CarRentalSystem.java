package Task7.Car;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarRentalSystem {
    Set<Car> allCars = new HashSet<>();
    Set<Car> availableCars = new HashSet<>();
    Map<Customer, Car> activeRentals = new HashMap<>();
    Map<Customer, LocalDateTime> rentalStartTimes = new HashMap<>();
    Map<Car, LocalDateTime> lastReturnTimes = new HashMap<>();

    public void addCar(Car car) {
        allCars.add(car);
        availableCars.add(car);
    }

    public void rentCar(Customer customer, Car car) {
        if (availableCars.contains(car)) {
            LocalDateTime rentTime = LocalDateTime.now();
            activeRentals.put(customer, car);
            rentalStartTimes.put(customer, rentTime);
            availableCars.remove(car);
            System.out.println("✅ " + customer.name + " rented " + car.model + " at " + rentTime);
        } else {
            System.out.println("❌ Car is not available!");
        }
    }

    public void returnCar(Customer customer) {
        Car car = activeRentals.get(customer);
        if (car != null) {
            LocalDateTime rentTime = rentalStartTimes.get(customer);
            LocalDateTime returnTime = LocalDateTime.now();

            Duration duration = Duration.between(rentTime, returnTime);
            long totalHours = duration.toHours();
            long days = totalHours / 24;

            System.out.println("🔄 " + customer.name + " returned " + car.model +
                    " after " + days + " days (" + totalHours + " hours total)");

            activeRentals.remove(customer);
            rentalStartTimes.remove(customer);
            availableCars.add(car);
            lastReturnTimes.put(car, returnTime);
        } else {
            System.out.println("❌ No active rental found for " + customer.name);
        }
    }

    public void printActiveRentals() {
        System.out.println("🚗 Active Rentals:");
        for (Map.Entry<Customer, Car> entry : activeRentals.entrySet()) {
            Customer customer = entry.getKey();
            Car car = entry.getValue();
            LocalDateTime rentTime = rentalStartTimes.get(customer);
            System.out.println(customer.name + " -> " + car.model + " (rented at " + rentTime + ")");
        }
    }

    public void printAvailableCars() {
        System.out.println("🚙 Available Cars:");
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }

    public void printRentalHistory() {
        System.out.println("📋 Rental History:");
        for (Map.Entry<Car, LocalDateTime> entry : lastReturnTimes.entrySet()) {
            System.out.println(entry.getKey().model + " was last returned at " + entry.getValue());
        }
    }
}