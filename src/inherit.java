import java.util.Scanner;

public class inherit extends newinherit {
inherit(String data){
    super(data);
    privatedata();
    System.out.println(data+" from inherit class");
}

    public static void inheritconcept(){
        Main obj=new Main("hai");
        obj.protecteddata();  // as it is non static i cant access it directly
        publicdata(); //as it is static method i can access it directly from inherit class
    }
    public  static void publicdata (){
        System.out.println("this is public data");
    }
    protected  void protecteddata (){
    System.out.println("protected data");
    }
    private static void privatedata(){
        System.out.println("private data");
    }
}
