package Task7.Car;

public class Main {
   public static void main(String[] args) throws InterruptedException {
      CarRentalSystem system = new CarRentalSystem();

      // Avtomobillər
      Car c1 = new Car(1, "Toyota", "Camry", "2022");
      Car c2 = new Car(2, "BMW", "X5", "2023");
      Car c3 = new Car(3, "Hyundai", "Elantra", "2021");

      system.addCar(c1);
      system.addCar(c2);
      system.addCar(c3);

      // Müştərilər
      Customer u1 = new Customer(101, "Aydin", "AZ12345");
      Customer u2 = new Customer(102, "Nigar", "AZ67890");

      // İcarəyə vermə
      system.rentCar(u1, c1);
      system.rentCar(u2, c2);

      system.printActiveRentals();
      system.printAvailableCars();

      // 53 saat gözləmək (test üçün 2 saniyə)
      Thread.sleep(2000);

      // Avtomobili qaytarmaq
      system.returnCar(u1);

      system.printRentalHistory();
      system.printAvailableCars();
   }
}