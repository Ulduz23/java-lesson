package Transport;

public class Bus implements  Transport {
    private final double ratePerKm = 5;
    private  final double speed = 50;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return distance * ratePerKm + passengers * 5;
    }

    @Override
    public String getTransportInfo() {
        return "Bus | " +
                "Rate per km: " + ratePerKm +
                " | Speed: " + speed;
    }
}
