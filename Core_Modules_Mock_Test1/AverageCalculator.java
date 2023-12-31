package Core_Modules_Mock_Test1;

//Write a Java program to calculate the average of a list of numbers using a do-while loop.
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the count of numbers: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Invalid count. Please enter a positive number.");
                return;
            }

            System.out.println("Enter the numbers:");
            int sum = 0;
            int number;
            int i = 0;

            do {
                number = scanner.nextInt();
                sum += number;
                i++;
            } while (i < count);

            double average = (double) sum / count;
            System.out.println("The average of the numbers is: " + average);
        }
    }
}
