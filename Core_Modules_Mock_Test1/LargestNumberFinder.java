package Core_Modules_Mock_Test1;

//Write a Java program to find the largest of three numbers using nested if-else statements.

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            int largest;

            if (num1 >= num2) {
                if (num1 >= num3) {
                    largest = num1;
                } else {
                    largest = num3;
                }
            } else {
                if (num2 >= num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
            }

            System.out.println("The largest number is: " + largest);
        }
    }
}