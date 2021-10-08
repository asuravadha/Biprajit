package oct08;

import java.util.Scanner;

public class thread_pract extends Thread{
    static int data=10;
    static int threadcount=0;

    public void run(){
        System.out.println("thread started");
        thread_pract1 obj=new thread_pract1();
        obj.createthread(obj,"thread "+threadcount++);

        System.out.println("thread stopped");
    }
    public static void main(String[] args){
        thread_pract obj1=new thread_pract();
        obj1.run();
        thread_pract obj2=new thread_pract();
        obj2.run();
    }

}
