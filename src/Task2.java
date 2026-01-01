import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /* task 1 */

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Eded musbetdir (positive)");
        } else if (number < 0) {
            System.out.println("Eded menfidir (negative)");
        } else {
            System.out.println("Eded sifirdir (zero)");
        }*/

        /* task2 */
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Bele bir gun yoxdu");
        }

        scanner.close();*/

        /* task 3*/

     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i += 2) {
            System.out.println(i);
        }
        scanner.close();*/

        /* task 4 (help)*/

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        int original = number;

        int reversed = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if (original == reversed) {
            System.out.println("Eded palindrome-dir");
            scanner.close();
            return;
        }

        temp = original;

        boolean increasing = true;
        boolean decreasing = true;

        int lastDigit = temp % 10;
        temp = temp / 10;

        while (temp > 0) {
            int currentDigit = temp % 10;

            if (currentDigit >= lastDigit) {
                increasing = false;
            }

            if (currentDigit <= lastDigit) {
                decreasing = false;
            }

            lastDigit = currentDigit;
            temp = temp / 10;
        }

        if (increasing) {
            System.out.println("Reqemler artan siradadir");
        } else if (decreasing) {
            System.out.println("Reqemler azalan siradadir");
        } else {
            System.out.println("The digits are neither in increasing nor decreasing order.");
        }

        scanner.close();*/

        /* task 5 */
       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();
        System.out.print("Male or female? : ");
        char gender = scanner.next().charAt(0); //help

        if (number < 18){
            System.out.println("Access denied");
        }
        else {
            if (gender == 'M'){
                System.out.println("Male access granted");
            } else if (gender == 'F') {
                System.out.println("Female access granted");
            }
            else {
                System.out.println("Invalid gender entered");
            }
        }

        scanner.close();*/

        /* task 6 */
       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Nece Fibonacci ededi cap edilsin? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number");
            scanner.close();
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            String type = (a % 2 == 0) ? "Even" : "Odd";
            System.out.println(a + " - " + type);

            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
*/


        /* task 7 */
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial does not exist for negative numbers");
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

        scanner.close();*/

        /*task 8 (help)*/
       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number = number / 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }

        scanner.close();*/


        /*task 9 (helping) */

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = number;

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }

            sum += power;
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        scanner.close();*/





    }
}
