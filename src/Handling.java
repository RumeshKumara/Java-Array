import java.util.InputMismatchException;
import java.util.Scanner;
public class Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        try {
            System.out.print("Enter first number: ");
            a = scanner.nextInt();
            System.out.print("Enter second number: ");
            b = scanner.nextInt();
            c = a / b;
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number");
        }
        System.out.println("Bye");
        scanner.close();
    }
}
