package Task10;

import java.util.Scanner;

public class SquareCalculator {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
             try {
                 System.out.print("Bir tam ədəd daxil edin: ");
                 number = Integer.parseInt(input.nextLine());
                 break;
             }
             catch (NumberFormatException e) {
                 System.out.println("Duzgun bir reqem daxil edin");
             }
        }

        int square = number * number;
        System.out.println("Daxil elediyiniz ededin kvadrati: " + square);
        input.close();
    }
}
