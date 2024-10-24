class A1 implements Runnable{
    public void run() {
        System.out.println("A1 is running");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new A1());
        thread1.start();
    }
}
