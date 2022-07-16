package Calisma;

import java.util.Scanner;

public class TekCiftProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Given an integer, , perform the following conditional actions:
        //
        //If  is odd, print Weird
        //If  is even and in the inclusive range of  to , print Not Weird
        //If  is even and in the inclusive range of  to , print Weird
        //If  is even and greater than , print Not Weird
        //Complete the stub code provided in your editor to print whether or not  is weird.

        System.out.print("Bir Rakam Giriniz: ");
        int n = input.nextInt();

        boolean kosul = n>=1 && n<=100;

            if(!kosul){
            System.out.print("Lutfen 1 ve 100 arasinda bir deger giriniz! : ");
            }

        n=input.nextInt();
        if(n%2==1){
            System.out.println("Weird");
        } if(n%2==0 &&(n>=2 && n<=5)){
            System.out.println("Not Weird");
        } if(n%2==0 && (n>=6 && n<= 20)){
            System.out.println("Weird");
        } if((n%2==0)&&(n>20)){
            System.out.println("Not Weird");
        }







    }


}
