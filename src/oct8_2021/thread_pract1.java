package oct8_2021;

public class thread_pract1 implements Runnable {
    static int data = 10;

    public static void main(String[] args) {
        thread_pract1 obj = new thread_pract1();

    }

    @Override
    public void run() {
        data++;
    }

    public static void createThread(thread_pract1 obj, String info) {
        Thread th1 = new Thread(obj);
        th1.start();
        System.out.println(info + " " + data);

    }
}
