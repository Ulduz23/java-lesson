package Task9;

import java.io.*;
import java.util.Scanner;

public class StudentIoClass {

    static void readStudents() {
        File file = new File("students.txt");
        if (!file.exists()) {
            System.out.println("File yoxdur");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] students = line.split(",");
                if (students.length == 3) {
                    System.out.println("Student " + students[0] + " Name " + students[1] + " Score " + students[2]);
                }
                else {
                    System.out.println("errorrr");
                }
            }
        } catch (IOException e) {
            System.out.println("Fayl oxunmadi");
        }
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tələbə ID-si ");
        String studentID  = scanner.nextLine();
        System.out.println("Telebe adi: " );
        String name = scanner.nextLine();
        System.out.println("Telebe bali: " );
        String score = scanner.nextLine();

        try {
            // Score-nu int tipinə çevirmək
            int scoreInt = Integer.parseInt(score);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true))) {
                writer.write(studentID + "," + name + "," + scoreInt + "\n");
                System.out.println("Tələbə uğurla əlavə edildi.");
            } catch (IOException e) {
                System.out.println("Fayla əlavə edilərkən problem yarandı: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Xəta: Bal yalnız ədəd olmalıdır.");
        }
    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        File file = new File("students.txt");
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("101,ARIF,80");
                writer.newLine();
            } catch (IOException e) {
                System.out.println("Fayl yaradılarkən xəta: " + e.getMessage());
            }
        }

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Bütün qeydləri görüntülə");
            System.out.println("2. Faylı yeni qeydlərlə əvəz et");
            System.out.println("3. Yeni qeyd əlavə et");
            System.out.println("4. Çıx");
            System.out.print("Seçiminizi daxil edin: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    readStudents();
                    break;
                case 2:
                    System.out.println("Faylı yeni qeydlərlə əvəz etmək bu nümunədə tətbiq olunmayıb.");
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    System.out.println("Proqramdan çıxılır.");
                    break;
                default:
                    System.out.println("Yanlis secim etdiniz");

            }
        }

        while (choice != 4);
scanner.close();
    }
}
