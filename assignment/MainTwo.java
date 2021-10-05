
import features.Signup;
import features.User;
import java.util.Scanner;

public class MainTwo {
    private static Object User;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Signup signObj = new Signup();

        String username, password, answer;
        boolean checkSignup = true;

        while(checkSignup == true) {
            System.out.println("Would you like to signup? yes or no");
            answer = sc.nextLine();

            if(answer.equals("yes")) {
                checkSignup = true;

                System.out.println("Enter a username: ");
                username = sc.nextLine();

                System.out.println("Enter a password: ");
                password = sc.nextLine();

                signObj.addUser(username, password);
            } else if(answer.equals("no")) {
                System.out.println("Thank you for signing up! ");
                checkSignup = false;
            }
        }

        // **
        User[] usersArr = signObj.getAllUsers();
        System.out.println(usersArr);
    }
}
