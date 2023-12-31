package Core_Modules_Mock_Test1;

//Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
