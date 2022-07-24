package Calisma;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "pusulafinans";
        String password = "123";
        int right = 3;
        int select;
        int balance = 1000;

        while (right>0){
            System.out.print("Kullanici adinizi giriniz: ");
            userName = input.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            password = input.nextLine();
            if(userName.equals("pusulafinans")&&password.equals("123")){
                System.out.println("Sisteme Giris Yaptiniz!");
                do{
                    System.out.println("1: Para Yatirma \n" + "2: Para Cekme\n" + "3: Bakiye Sorma\n" + "4: Cikis");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                    if(select==1){
                        System.out.print("Yatiracaginiz bakiye miktari: ");
                        int moneyPlus = input.nextInt();
                        balance+=moneyPlus;
                    }else if(select==2){
                        System.out.print("Cekeceginiz bakiye miktari: ");
                        int moneyMinus = input.nextInt();
                        if(moneyMinus>balance){
                            System.out.println("Yetersiz bakiye!");
                        }else {
                            balance-=moneyMinus;
                        }
                    }else if (select==3){
                        System.out.println("Hesap bakiyeniz: " + balance);
                    }
                }while (select!=4);
                System.out.println("Cikis yaptiniz!");
                break;
            }else {
                right--;
                System.out.println("Yanlis girdiniz, tekrar deneyiniz!");
                if(right==0){
                    System.out.println("\nKartiniz bloke olmustur!");
                }else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }
    }
}
