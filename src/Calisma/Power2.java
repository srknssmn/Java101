package Calisma;
import java.util.Scanner;
public class Power2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int sayi;
        System.out.print("Ekrana bir sayi yaziniz: ");
        sayi= input.nextInt();

        for(int i=1;i<sayi;i*=2){

            System.out.println(i);
        }
    }
}
