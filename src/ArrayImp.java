
import java.util.Scanner;

public class ArrayImp {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        char[] arry1 = {'a', 'b', 'c', 'd', 'e'};
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        System.out.println("Sum of the array elements: " + sum);
//        System.out.println(array.length);
//        System.out.println(array[2]);

        int[] arr = new int[5];

        int size = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the array elements: " + sum);

    }
}

