import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adiniz Nedir? ");

        String ad = input.nextLine();
        System.out.println("Dogru Adiniz : " + ad);

        System.out.print("Soyadiniz Nedir? ");

        String soyad = input.nextLine();
        System.out.println("Dogru Soyadiniz : " + soyad);

        int a;

        System.out.print("Kac Yasindasiniz? : ");

        a = input.nextInt();

        System.out.println("Dogru Yasiniz : " + a);

        System.out.println("Supersiniz");

        System.out.print("Kac Yasindasiniz? : ");

        double c = input.nextDouble();

        System.out.println("Dogru Yasiniz : " + c);



    }


}
