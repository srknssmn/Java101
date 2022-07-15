package Odevler;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        //Doğum Tarihi %12 = 0 ➜ Maymun
        //Doğum Tarihi %12 = 1 ➜ Horoz
        //Doğum Tarihi %12 = 2 ➜ Kopek
        //Doğum Tarihi %12 = 3 ➜ Domuz
        //Doğum Tarihi %12 = 4 ➜ Fare
        //Doğum Tarihi %12 = 5 ➜ Okuz
        //Doğum Tarihi %12 = 6 ➜ Kaplan
        //Doğum Tarihi %12 = 7 ➜ Tavsan
        //Doğum Tarihi %12 = 8 ➜ Ejderha
        //Doğum Tarihi %12 = 9 ➜ Yilan
        //Doğum Tarihi %12 = 10 ➜ At
        //Doğum Tarihi %12 = 11 ➜ Koyun

        int year,zodiac;
        System.out.print("Which is your born year? ");
        year= input.nextInt();
        zodiac=year%12;

        if(year>0){
            if(zodiac==0){
                System.out.println("Your Chinese Zodiac is: Maymun");
            }else if (zodiac==1){
                System.out.println("Your Chinese Zodiac is: Horoz");
            }else if (zodiac==2){
                System.out.println("Your Chinese Zodiac is: Kopek");
            }else if (zodiac==3){
                System.out.println("Your Chinese Zodiac is: Domuz");
            }else if (zodiac==4){
                System.out.println("Your Chinese Zodiac is: Fare");
            }else if (zodiac==5){
                System.out.println("Your Chinese Zodiac is: Okuz");
            }else if (zodiac==6){
                System.out.println("Your Chinese Zodiac is: Kaplan");
            }else if (zodiac==7){
                System.out.println("Your Chinese Zodiac is: Tavsan");
            }else if (zodiac==8){
                System.out.println("Your Chinese Zodiac is: Ejderha");
            }else if (zodiac==9){
                System.out.println("Your Chinese Zodiac is: Yilan");
            }else if (zodiac==10){
                System.out.println("Your Chinese Zodiac is: At");
            }else if (zodiac==11){
                System.out.println("Your Chinese Zodiac is: Koyun");
            }else{
                System.out.println("Yanlis Bilgi Girdiniz!");
            }
        }else{
            System.out.println("Yanlis Bilgi Girdiniz!");
        }
    }
}
