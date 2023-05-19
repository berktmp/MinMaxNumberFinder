import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of N from the user
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize variables to hold the largest and smallest numbers
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Read N numbers from the user and update the largest and smallest variables
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        // Print the largest and smallest numbers
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
