package Odevler;
import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart

        int month;

        System.out.println("Burc Sistemine Hos Geldiniz!");
        System.out.print("Kacinci Ayda Dogdunuz? ");
        month= input.nextInt();
        if(month<1||month>12) {
            System.out.println("Hatali Ay Girdiniz!");
        }
        int day;
        System.out.print("Kacinci Gunde Dogdunuz? ");
        day= input.nextInt();

        if(month==1){
            if(day>=1&&day<=21){
                System.out.println("Oglak Burcusunuz!");
            }else if(day>21&&day<=31){
                System.out.println("Kova Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==2){
            if(day>=1&&day<=19){
                System.out.println("Kova Burcusunuz!");
            }else if(day>19&&day<=31){
                System.out.println("Balik Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==3){
            if(day>=1&&day<=20){
                System.out.println("Balik Burcusunuz!");
            }else if(day>20&&day<=31){
                System.out.println("Koc Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==4){
            if(day>=1&&day<=20){
                System.out.println("Koc Burcusunuz!");
            }else if(day>20&&day<=31){
                System.out.println("Boga Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==5){
            if(day>=1&&day<=21){
                System.out.println("Boga Burcusunuz!");
            }else if(day>21&&day<=31){
                System.out.println("Ikizler Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==6){
            if(day>=1&&day<=22){
                System.out.println("Ikizler Burcusunuz!");
            }else if(day>22&&day<=31){
                System.out.println("Yengec Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==7){
            if(day>=1&&day<=22){
                System.out.println("Yengec Burcusunuz!");
            }else if(day>22&&day<=31){
                System.out.println("Aslan Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==8){
            if(day>=1&&day<=22){
                System.out.println("Aslan Burcusunuz!");
            }else if(day>22&&day<=31){
                System.out.println("Basak Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==9){
            if(day>=1&&day<=22){
                System.out.println("Basak Burcusunuz!");
            }else if(day>22&&day<=31){
                System.out.println("Terazi Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==10){
            if(day>=1&&day<=22){
                System.out.println("Terazi Burcusunuz!");
            }else if(day>22&&day<=31){
                System.out.println("Akrep Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==11){
            if(day>=1&&day<=21){
                System.out.println("Akrep Burcusunuz!");
            }else if(day>21&&day<=31){
                System.out.println("Yay Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }else if(month==12){
            if(day>=1&&day<=21){
                System.out.println("Yay Burcusunuz!");
            }else if(day>21&&day<=31){
                System.out.println("Oglak Burcusunuz!");
            }else{
                System.out.println("Hatali Gun Girdiniz!");
            }
        }
    }
}
