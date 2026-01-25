package Task7.Passenger;

public class BusSimulation {
     static void main(String[] args) {
        Bus bus = new Bus();
        BusStop stop1 = new BusStop();
        BusStop stop2 = new BusStop();
        BusStop stop3 = new BusStop();

        // Dayanacaq 1
        stop1.addPassenger(new Passenger(true, "Aysel"));
        stop1.addPassenger(new Passenger(false, "Rauf"));
        stop1.addPassenger(new Passenger(false, "Ali"));

        System.out.println("Stop 1 reached.");
        stop1.boardPassenger(bus);
        bus.displayPassengers();
        stop1.displayWaitingPassengers();

        // Dayanacaq 2
        stop2.addPassenger(new Passenger(true, "Nigar"));
        stop2.addPassenger(new Passenger(true, "Samir"));
        stop2.addPassenger(new Passenger(false, "Murad"));

        System.out.println("Stop 2 reached.");
        stop2.boardPassenger(bus);
        bus.displayPassengers();
        stop2.displayWaitingPassengers();

        // Dayanacaq 3
        stop3.addPassenger(new Passenger(true, "Sevinc"));
        stop3.addPassenger(new Passenger(false, "Leyla"));
        stop3.addPassenger(new Passenger(false, "Tural"));

        System.out.println("Stop 3 reached.");
        stop3.boardPassenger(bus);
        bus.displayPassengers();
        stop3.displayWaitingPassengers();

        // Simulyasiya tamamlandı
        System.out.println("Simulation finished.");
        System.out.println("Final passengers in bus: " + bus.passengers);
    }
}

