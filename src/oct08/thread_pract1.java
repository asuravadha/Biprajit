package oct08;

public class thread_pract1 implements Runnable {
    public void createthread(thread_pract1 obj,String info){
        Thread thread1=new Thread(obj);
        thread1.start();
        System.out.println(info+"  "+data);
        data++;
        System.out.println(info+"   "+data);
    }
    static int data=10;
public static void main(String[] args){
//    thread_pract1 obj=new thread_pract1();
//    Thread thread=new Thread(obj);
//    thread.start();
//
//    while(thread.isAlive()){
//        System.out.println("waiting..");
//    }
//    System.out.println(data);
//    data++;
//    System.out.println(data);
}

    @Override
    public void run() {
        data++;
    }
}
