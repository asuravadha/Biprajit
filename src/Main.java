import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
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
            arr.data("",r,c);
        }

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
