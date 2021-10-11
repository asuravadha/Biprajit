package oct05.auth;

import oct05.data.user;

import java.util.ArrayList;
import java.util.Scanner;

public class auth extends signup {
    public static void authentication(){
        ArrayList<user> users=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Enter s for signup anyother for login");

            if (input.next().equals("s")) {
                userSignup(users);
            } else {
                userSignin(users);
            }
            System.out.println("Enter q to quit from system anyother to continue");

        } while (!input.next().equals("q"));
    }
}
