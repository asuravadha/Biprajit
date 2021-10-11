package oct11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String,String> usercred=new HashMap<>();
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    while(true){
        System.out.println("Enter s for signup l for login q to quit");
        String option=input.next();
        if(!option.equals("q")){
            System.out.println("enter username");
           String username=input.next();
           System.out.println("Enter password");
           String password=input.next();
           if(option.equals("l")){
               login(username,password);
           }else if(option.equals("s")){
               signup(username,password);
           }else{
               System.out.println("invlaid choice");
           }
        }else{
            break;
        }
    }

}

    private static void signup(String username, String password) {
    filereader("usercredentials.txt");
    boolean flag=true;
        for (String user : usercred.keySet()) {
            if(user.equals(username)){
                System.out.println("user already exist");
                flag=false;
            }
        }
        if(flag){
            filewriter("usercredentials.txt",username+" "+password);
            System.out.println("signup successful");
        }

    }

    private static void login(String username, String password) {
        filereader("usercredentials.txt");
        boolean flag=true;
        for (String user : usercred.keySet()) {
            if(user.equals(username)){
                if (usercred.get(user).equals(password)) {
                    flag=false;
                    System.out.println("login successful");
                    Scanner input=new Scanner(System.in);
                    while(true){
                        System.out.println("1)add data 2)remove data 3)update credentails");
                        String option=input.next();
                        if(option.equals("1")){
                            System.out.println("Enter data to be added");
                            filewriter("data.txt",user+" "+input.next());
                        }
                        System.out.println("Enter q to quit any other to continue");

                        if(input.next().equals("q")){
                            break;
                        }
                    }
                }else{
                    System.out.println("wrong password");
                }
            }
        }
        if(flag){
            System.out.println("user not found");
        }
    }


    private static void filewriter(String filename,String data) {
        try {
            FileWriter writer=new FileWriter(filename,true);
            writer.write("\n"+data);
            writer.close();
            System.out.println("data updated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static  void filereader(String filename) {
        usercred.clear();
       File file=new File(filename);

        try {
            Scanner fetch=new Scanner(file);

            while(fetch.hasNextLine()){
                String line=fetch.nextLine();
                String[] up=line.split(" ",2);
               usercred.put(up[0],up[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
