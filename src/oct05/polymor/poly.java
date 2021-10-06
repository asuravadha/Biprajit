package oct05.polymor;

class poly1 extends poly2 {
    public static void data1(){
        System.out.println("i am from poly1");
    }
    public static void data(String data,int data1){
        System.out.println("i am from poly2");
    }
    public static void data(int data1,String data){
        System.out.println("i am from poly2");
    }
    public static void main(String[] args){
        data(12323,"tytr");
        data1();
    }
}

class poly2{
    public static void data1(){
        System.out.println("i am from poly2");
    }
}
