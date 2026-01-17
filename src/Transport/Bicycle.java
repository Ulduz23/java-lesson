package Transport;

public class Bicycle implements  Transport{

    private final double ratePerKm = 1;
    private final double speed = 20;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance); // passengers ignored
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bicycle | Rate per km: " + ratePerKm + " | Speed: " + speed;
    }
}
