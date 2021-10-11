package oct8_2021;

public class ThreadPractice extends Thread {
    static int data = 10;

    public void run() {
        thread_pract1 obj = new thread_pract1();
        obj.createThread(obj);
        data++;
    }

    public static void main(String[] args) {
        ThreadPractice threadObj = new ThreadPractice();
        threadObj.run();
    }
}
