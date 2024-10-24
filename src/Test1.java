class R extends Thread {
    public void run() {
        System.out.println("Thread A is running");
    }
}

public class Test1 {
    public static void main(String[] args) {
        R thread = new R();
        thread.start();
    }
}
