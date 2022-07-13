import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Bugünün hangi gün olduğunu bulma?

        System.out.print("Sayi Olarak Bir Gun Giriniz: ");
        int day =input.nextInt();

        /*
        if(day==1){
            System.out.println("Bugun Pazartesi");
        } else if (day==2) {
            System.out.println("Bugun Sali");
        } else if (day==3) {
            System.out.println("Bugun Carsamba");
        } else if (day==4) {
            System.out.println("Bugun Persembe");
        } else if (day==5) {
            System.out.println("Bugun Cuma");
        } else if (day==6) {
            System.out.println("Bugun Cumartesi");
        }else if (day==7){
            System.out.println("Bugun Pazar");
        }else {
            System.out.println("Hatali Giris Yaptiniz!");

         */

        switch (day){
            case 1:
                System.out.println("Bugun Pazartesi");
                break;
            case 2:
                System.out.println("Bugun Sali");
                break;
            case 3:
                System.out.println("Bugun Carsamba");
                break;
            case 4:
                System.out.println("Bugun Persembe");
                break;
            case 5:
                System.out.println("Bugun Cuma");
                break;
            case 6:
                System.out.println("Bugun Cumartesi");
                break;
            case 7:
                System.out.println("Bugun Pazar");
                break;
            default:
                System.out.println("Dogru Bir Deger Giriniz!");

        }

    }
}
