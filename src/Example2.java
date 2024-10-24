class R1 extends Thread {
    public void run(){
        for (int i = 0; i<10; i++)
        {
            System.out.println("Hello World");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        }
}
class R2 extends Thread {
    public void run(){
        for (int i = 0; i<10; i++)
        {
            System.out.println("Goodbye World");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }
}


public class Example2 {
    public static void main(String[] args) {
        R1 thread1 = new R1();
        R2 thread2 = new R2();

        thread1.start();
        thread2.start();
    }
}
