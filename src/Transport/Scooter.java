package Transport;

public class Scooter implements Transport{
    private final double ratePerKm = 3;
    private final double speed = 40;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Scooter | Rate per km: " + ratePerKm + " | Speed: " + speed;
    }
}
