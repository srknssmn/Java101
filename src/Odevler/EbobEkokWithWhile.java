package Odevler;
import java.util.Scanner;
public class EbobEkokWithWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();

        int i = 1, ebob = 1;

        if (n1 < n2) {
            while (i < n1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        }
        if (n1 > n2) {
            while (i < n2) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Ebob= " + ebob);
        // Ekok= (n1*n2)/ebob
        System.out.print("Ekok= "+ ((n1*n2)/ebob));
    }

}




