package Lab1;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[n];

        // Prompt the user to enter the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the numbers
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / n;

        // Print the average
        System.out.println("The average is: " + average);

        scanner.close();
    }
}