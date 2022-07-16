package Calisma;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.print("Kullanici Adinizi Giriniz: ");
        username= input.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        password= input.nextLine();

        if(username.equals("serkan")&&password.equals("serkan1234")){
            System.out.print("Giris Yaptiniz!");
        }else {
            System.out.print("Bilgiler Yanlis!");
        }
    }
}
