package Task7.Passenger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bus {
    public List<Passenger> passengers;
    public final int capacity = 5;

    public Bus() {
        this.passengers = new LinkedList<>();
    }

    public void board(Passenger passenger) {
        passengers.add(passenger);
    }

    public void drop(Passenger passenger) {
        passengers.remove(passenger);

    }

    public void displayPassengers() {
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }
}
