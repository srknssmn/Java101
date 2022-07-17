package Odevler;
import java.util.Scanner;
public class Mod3Mod4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi,total=0,time=0;
        System.out.print("Bir sayi giriniz: ");
        sayi= input.nextInt();

        for(int i=1; i<=sayi;i++){
            if(i%3==0&&i%4==0) {
                total+= i;
                time++;
            }
        }
        if (time==0){
            System.out.println("3e veya 4e bolunecek sayi bulunamadi!");
        }else {
            System.out.println(total / time);
        }
    }
}
