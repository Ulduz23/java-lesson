package Transport;

public interface Transport  {

    double calculateFare(double distance);

    double calculateFare(double distance, int passengers); // overloading

    double calculateTime(double distance);

    String getTransportInfo();

}
