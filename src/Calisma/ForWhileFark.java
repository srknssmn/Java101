package Calisma;

import java.util.Scanner;
public class ForWhileFark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        String yazi;

        for(boolean kosul=true; kosul;){

            System.out.print("bir sey yazin: ");
            yazi=input.nextLine();
                if(yazi.equals("go")){
                    System.out.println("Sistem kapandi!");
                    kosul=false;
            }
        } */

        String yazi;
        do{
            System.out.print("bir sey yazin: ");
            yazi=input.nextLine();

        }while (!yazi.equals("go"));
    }
}
