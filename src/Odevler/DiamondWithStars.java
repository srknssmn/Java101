package Odevler;
import java.util.Scanner;
public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb;
        System.out.print("Enter a number: ");
        numb = input.nextInt();

        int tempNumb=numb;

        for(int i=1; i<=tempNumb; i++){
            for(int j=1; j<=(tempNumb-i);j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        tempNumb=numb;

        for(int p=1; p<=(tempNumb-1); p++){
            for( int p1=1; p1<=(numb-(numb-p)); p1++){
                System.out.print(" ");
             }
            for(int l=1; l<=(((tempNumb - p) * 2) - 1); l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}