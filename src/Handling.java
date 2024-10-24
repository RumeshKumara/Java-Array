import java.util.Scanner;
public class Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        try {
            c = a / b;
            System.out.println("Result: " + c);
        }
        catch (Exception e) {
            System.out.println("Error: Division by zero.");
        }
        System.out.println("Bye");
        scanner.close();
    }
}
