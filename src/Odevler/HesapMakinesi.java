package Odevler;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("First number: ");
        n1=input.nextInt();
        System.out.print("Second number: ");
        n2=input.nextInt();
        System.out.println("Plus 1\nMinus 2\nMultiply 3\nDivide 4");
        System.out.print("Choise ");
        n3=input.nextInt();

        switch (n3){
            case 1:
                System.out.println("Result: " +(n1+n2));
                break;
            case 2:
                System.out.println("Result: " +(n1-n2));
                break;
            case 3:
                System.out.println("Result: " +(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Result: " +(n1/n2));
                    }else{
                    System.out.println("Cannot be divided by zero!");
                }
                break;
            default:
                System.out.println("Enter a correct value!");
                break;
        }

    }
}
