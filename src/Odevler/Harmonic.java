package Odevler;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb;
        double total=0;
        System.out.print("Give a number: ");
        numb= input.nextInt();

        for(double i=1; i<=numb; i++){
            total+=(1/i);
        }
        System.out.print("Harmonic total: " + total);
    }
}