import java.util.Scanner;

public class ArrayEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Even numbers in the array:");
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.println("\nOdd numbers in the array:");
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}
