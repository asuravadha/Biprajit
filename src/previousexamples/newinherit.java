package previousexamples;

import java.util.Scanner;

public class newinherit {
      newinherit(String data){
        System.out.println("this is new previousexamples.inherit constructor "+data);
    }
    public  static void array(){
        arrays arr=new arrays();
        int r=0,c=0;
        arr.data("reset",r,c);
        Scanner input=new Scanner(System.in);
        label:
        while(true){
            System.out.println("enter u,d,l,r or anyother to quit");
            String option=input.next();
            switch (option) {
                case "u":
                    r--;
                    break;
                case "d":
                    r++;
                    break;
                case "l":
                    c--;
                    break;
                case "r":
                    c++;
                    break;
                default:
                    break label;
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
}
