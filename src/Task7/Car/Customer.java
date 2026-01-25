package Task7.Car;

import java.util.Objects;

public class Customer {
    public int id;
    public String name;
    public String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && licenseNumber.equals(customer.licenseNumber) && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, licenseNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licenseNumber=" + licenseNumber +
                '}';
    }
}