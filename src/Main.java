import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 class Main extends inherit{
    public  static void array(){
        arrays arr=new arrays();
        int r=0,c=0;
        arr.data("reset",r,c);
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("enter u,d,l,r or anyother to quit");
            String option=input.next();
            if(option.equals("u")){
                r--;
            }
            else if(option.equals("d")){
                r++;
            }
            else if(option.equals("l")){
                c--;
            }
            else if(option.equals("r")){
                c++;
            }
            else{
                break;
            }
            boolean flag=arr.data("",r,c);
            if(!flag){
                arr.data("reset",0,0);
                System.out.println("loop is reset");
                r=0;
                c=0;
            }

        }
    }
    Main(String data){
        super(data);
    System.out.println(data+" from Main class");
    }
    public static void inheritconcept(){
        Main obj=new Main("hai");
        obj.protecteddata();  // as it is non static i cant access it directly
        publicdata(); //as it is static method i can access it directly from inherit class

    }

    public static void main(String[] args){
        //to implement arra grid game  use array();
        //array();
        //to implement inherit concept call inheritconcept();
        inheritconcept();

//        File obj=new File("data.txt");
//        Scanner input= null;
//        try {
//            input = new Scanner(obj);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(input.hasNextLine()){
//            String data=input.nextLine();
//            System.out.println(data);
//        }

        //        String[] names=new String[10];
//        Scanner input=new Scanner(System.in);
//
//        for(int i=0;i<names.length;i++){
//            System.out.println("Enter your name");
//           names[i]=input.next();
//        }
//System.out.println("Values are");
//        for(String name:names){
//            System.out.println(name);
//        }
    }
}
