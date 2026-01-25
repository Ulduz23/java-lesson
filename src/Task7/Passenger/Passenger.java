package Task7.Passenger;

public class Passenger {
    public String name;
    public boolean isPriority;

    public Passenger(boolean isPriority, String name) {
        this.isPriority = isPriority;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isPriority() {
        return isPriority;
    }

    @Override
    public String toString() {
        return name + (isPriority ? "(PRIORITY)" : "");
    }
}
