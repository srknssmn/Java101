package Odevler;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;

        System.out.print("What is the temperature? ");
        temp=input.nextInt();

        if(temp<5){
            System.out.println("You can ski!");
        }else if(temp>=5&&temp<=15){
            System.out.println("You can go to cinema!");
        }else if (temp>25) {
            System.out.println("You can go to swim!");
        }
        if(temp>=10&&temp<=25) {
            System.out.println("You can go to picnic!");
        }
    }
}
