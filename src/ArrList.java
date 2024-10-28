import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original list: " + list);

        list.remove(2);

        System.out.println("List after removing element at index 2: " + list);

        list.set(2, 10);

        System.out.println("List after changing element at index 2: " + list);
    }
}
