package Odevler;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Bir yil giriniz: ");
        year= input.nextInt();

        if ((year%4==0)&&!((year%100==0)&&!(year%400==0))){
            System.out.println(+year+ "\t Bir artik yildir!");
        }else{
            System.out.println(+year+ "\t Bir artik yil degildir!");
        }
    }
}
