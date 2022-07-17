package Odevler;
import java.util.Scanner;
public class ModEvenMod4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a, total=0;

        do{
            System.out.print("Ekrana bir sayi giriniz: ");
            a =input.nextInt();
            if(a%2==0&&a%4==0){
                total+=a;
                System.out.println(total);
            }
        }while (!(a%2==1));
        System.out.print("Tek sayi girdiniz!");
    }
}
