package Calisma;

import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        int a=1,k;
        System.out.println("Start");

        while(a<=5){
            System.out.println(a);
            k=1;
            while(k<=5){
                System.out.print(k+",");
                k++;
            }
            System.out.println();
            a++;
        }
        */

        int pass;
        boolean kosul=false;

        while(!kosul){
            System.out.print("Sifrenizi giriniz: ");
            pass=input.nextInt();
            if(pass==123){
                System.out.print("Sifre dogru, Sisteme girdiniz.");
                kosul=true;
            }else{
                System.out.print("Sifre yanlis, tekrar deneyiniz.");
                System.out.println();
            }
        }
    }
}
