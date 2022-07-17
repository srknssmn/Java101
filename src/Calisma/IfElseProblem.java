package Calisma;

import java.util.Scanner;

public class IfElseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //En küçük sayı hangisidir?

        int a,b,c;
        System.out.println("3 Adet Sayi Gireceksiniz.");
        System.out.print("1. Sayi: ");
        a=input.nextInt();
        System.out.print("2. Sayi: ");
        b=input.nextInt();
        System.out.print("3. Sayi: ");
        c=input.nextInt();

        if(a<b&&a<c){
            System.out.println("En Kucuk Sayi A Sayisidir.");
        }else if(b<a&&b<c) {
            System.out.println("En Kucuk Sayi B Sayisidir.");
        }else {
            System.out.println("En Kucuk Sayi C Sayisidir.");
        }
    }
}
