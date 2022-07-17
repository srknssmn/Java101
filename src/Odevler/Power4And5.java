package Odevler;
import java.util.Scanner;
public class Power4And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int sayi;
        System.out.print("Ekrana bir sayi yaziniz: ");
        sayi= input.nextInt();

        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("-----------");

        for(int j=1;j<=sayi;j*=5){
            System.out.println(j);
        }
    }
}
