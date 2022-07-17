package Calisma;

import java.util.Scanner;
public class PlaneTicketProb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın.
        // İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        // Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        // Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int dist,age,choice;
        double fee=0.10,pay;

        System.out.print("Ucak ile kac km gideceksiniz? ");
        dist= input.nextInt();
        System.out.println("Yolculuk Tipinizi Seciniz!");
        System.out.println("Tek Yon:1 Gidis-Donus:2 ");
        choice=input.nextInt();
        System.out.print("Kac Yasindasiniz? ");
        age=input.nextInt();
        pay=dist*fee;

        if(dist>0){
            switch (choice){
                case 1:
                    if (age>=0&&age<12){
                        System.out.println("Bilet fiyatiniz: "+ (pay-(pay*0.5)));
                    }else if(age>=12&&age<24){
                        System.out.println("Bilet fiyatiniz: "+(pay-(pay*0.1)));
                    }else if(age>=65){
                        System.out.println("Bilet fiyatiniz: "+(pay-(pay*0.3)));
                    }else if(age>23&&age<65){
                        System.out.println("Bilet fiyatiniz: "+pay);
                    }else{
                        System.out.println("Gecerciz bilgi girdiniz!");
                    }break;
                case 2:
                    if(age>=0&&age<12){
                        System.out.println("Bilet fiyatiniz: "+(2*((pay-(pay*0.5))-((pay-(pay*0.5))*0.2))));
                    }else if(age>=12&&age<24){
                        System.out.println("Bilet fiyatiniz: "+(2*((pay-(pay*0.1))-((pay-(pay*0.1))*0.2))));
                    }else if(age>=65){
                        System.out.println("Bilet fiyatiniz: "+ (2*((pay-(pay*0.3))-((pay-(pay*0.3))*0.2))));
                    }else if(age>23&&age<65){
                        System.out.println("Bilet fiyatiniz: "+(2*(pay-(pay*0.2))));
                    }else{
                        System.out.println("Gecerciz bilgi girdiniz!");
                    }break;
                default:
                    System.out.println("Gecerciz bilgi girdiniz!");
            }
        }else{
            System.out.println("Gecerciz bilgi girdiniz!");
        }
    }
}
