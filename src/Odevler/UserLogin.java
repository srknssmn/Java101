package Odevler;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password,reply,newPassword,newnewPassword;

        System.out.print("Username: ");
        username= input.nextLine();
        System.out.print("Password: ");
        password= input.nextLine();

        if(username.equals("pusulafinans")&&password.equals("pf1234")){
            System.out.print("You are logged in!");
        }else if(!(username.equals("pusulafinans")&&password.equals("pf1234"))) {
            System.out.println("Worng username or password. Please reset your password");
            System.out.println("Would you like to reset your password? yes or no ");
            reply= input.nextLine();
            if(reply.equals("yes")){
                System.out.println("Do not use the same password");
                newPassword= input.nextLine();
                    if (!(newPassword.equals("pf1234"))){
                        System.out.print("Password created!");
                    }else if ((newPassword.equals("pf1234"))){
                        System.out.println("Could not create password, please enter new password.");
                        newnewPassword=input.nextLine();
                        if(!(newnewPassword.equals("pf1234"))){
                            System.out.print("Password created!");
                        }else{
                            System.out.print("Too many false attempts!");
                        }
                    }
            }else if(reply.equals("no")){
                System.out.println("Logged out");
            }else{
                System.out.println("Choose any option");
            }
        }



    }
}
