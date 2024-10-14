class A {
    void print() {
        System.out.printf("A");
    }
}

class B extends A {
    void print() {
        System.out.printf("B");
    }
}


public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.print(); // Output: B

        A a1 = new B();
        a1.print(); // Output: A



    }
}