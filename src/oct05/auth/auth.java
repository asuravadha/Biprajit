package oct05.auth;

import oct05.data.user;

import java.util.ArrayList;
import java.util.Scanner;

public class auth {
    public
    void authentication(){
        ArrayList<user> users=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Enter s for signup anyother for login");
            if (input.next().equals("s")) {
                String username, password, data;
                System.out.println("Enter username");
                username = input.next();
                System.out.println("Enter passsword");
                password = input.next();
                System.out.println("Enter your data");
                data = input.next();

                users.add(new user(username, password, data));
                System.out.println("registered successfully");

            } else {
                String username, password, data;
                System.out.println("Enter username");
                username = input.next();
                System.out.println("Enter passsword");
                password = input.next();
                boolean flag = true;
                for (oct05.data.user user : users) {
                    if (username.equals(user.getUsername())) {
                        flag = false;
                        if (password.equals(user.getPassword())) {
                            System.out.println("login successful");
                            System.out.println(user.getData());
                            while (true) {
                                System.out.println("1)change username 2)change password 3)update data 4)logout");
                                String option = input.next();
                                int o = Integer.parseInt(option);
                                if (o == 1) {
                                    System.out.println("enter your new username");
                                    String currentusername = user.getUsername();
                                    String newusername = input.next();
                                    user.setUsername(newusername);
                                    System.out.println("username updated from " + currentusername + " to " + newusername);
                                } else if (o == 2) {
                                    System.out.println("enter your new password");
                                    String currentpassword = user.getPassword();
                                    String newpassword = input.next();
                                    user.setPassword(newpassword);
                                    System.out.println("password updated from " + currentpassword + " to " + newpassword);
                                } else if (o == 3) {
                                    System.out.println("enter new data to add");
                                    String currentdata = user.getData();
                                    String newdata = input.next();
                                    currentdata = currentdata + newdata;
                                    currentdata += newdata;
                                    user.setData(currentdata);
                                    System.out.println("data updated");
                                } else if (o == 4) {
                                    System.out.println("logout");
                                    break;
                                } else {
                                    System.out.println("invalid input");
                                }
                            }


                        } else {
                            System.out.println("wrong password");
                        }
                    }
                }

                if (flag) {
                    System.out.println("user not found so register");
                }

            }
            System.out.println("Enter q to quit from system anyother to continue");

        } while (!input.next().equals("q"));
    }
}
