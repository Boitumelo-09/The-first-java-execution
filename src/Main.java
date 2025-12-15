//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 80; i++) {
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("  Welcome Bro... ");
        System.out.println("...................");

        System.out.print("Enter your name bro : ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth year bro : ");
        int birthYear = scanner.nextInt();

        int currentYear = LocalDateTime.now().getYear();
        int age = currentYear - birthYear;

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        clearScreen();

        System.out.println("\n--- HERE'S YOUR REPORT BROTHER ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Executed at : " + time);

        if (age >= 18) {
            System.out.println("Status      : ACCESS GRANTED");
        } else {
            System.out.println("Status      : ACCESS DENIED");
        }

        System.out.println("-------------------------");
        System.out.println("shutting down safely.");

        scanner.close();
    }
}
