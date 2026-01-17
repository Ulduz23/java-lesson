package Transport;

public class TransportManager {

    public static Transport getTransport(TransportType type) {

        return switch (type) {
            case BUS -> new Bus();
            case TAXI -> new Taxi();
            case BICYCLE -> new Bicycle();
            case SCOOTER -> new Scooter();
        };
    }

     static void main(String[] args) {

        TransportType userChoice = TransportType.TAXI;
        double distance = 10.0;
        int passengers = 2;

        Transport transport = getTransport(userChoice);

        System.out.println("Transport Info: " + transport.getTransportInfo());
        System.out.println("Fare for " + passengers + " passenger(s): "
                + transport.calculateFare(distance, passengers));
        System.out.println("Estimated time: "
                + transport.calculateTime(distance) + " hours");
    }
}
