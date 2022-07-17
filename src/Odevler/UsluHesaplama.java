package Odevler;
import java.util.Scanner;
public class UsluHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c=1;
        System.out.print("Ussu alinacak sayiyi yaziniz: ");
        a = input.nextInt();
        System.out.print("Us sayisini yaziniz: ");
        b = input.nextInt();

        for(int i=1;i<=b;i++){
            c*=a;
        }
        System.out.print(c);
    }
}
