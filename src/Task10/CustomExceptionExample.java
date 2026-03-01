package Task10;

import java.util.Scanner;

public class CustomExceptionExample {
    static void checkAge(int age) throws InvalidInputException {
        if (age < 18 || age > 100) {
            throw new InvalidInputException("Yasin 18den 100 e qeder olmalidir");
        }
    }

    public static void checkTemperature(int temperature) throws InvalidInputException {
        if (temperature < -50 || temperature > 50) {
            throw new InvalidInputException("Temperatur -50 ilə 50 arasında olmalıdır");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        try {
            System.out.print("Yaşınızı daxil edin: ");
            age = input.nextInt();
            checkAge(age);
        } catch (InvalidInputException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        int temperature;

        try {
            System.out.print("Temperaturu daxil edin: ");
            temperature = input.nextInt();
            checkTemperature(temperature);
        } catch (InvalidInputException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        input.close();
    }
}
