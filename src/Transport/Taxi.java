package Transport;

public class Taxi implements  Transport{

    private final double ratePerKm = 10;
    private  final double speed = 100;
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return distance * ratePerKm + passengers * 5;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taxi | Rate per km: " + ratePerKm + " | Speed: " + speed;
    }
}
