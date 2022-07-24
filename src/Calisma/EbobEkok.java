package Calisma;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();
        int ebob=1;

        if(n1<n2){
            for(int i=1 ; i<n1; i++){
                if (n1%i==0 && n2%i==0){
                    ebob=i;
                }
            }
        }
        if(n2<n1){
            for(int i=1 ; i<n2; i++){
                if (n1%i==0 && n2%i==0){
                    ebob=i;
                }
            }
        }
        System.out.println("Ebob= "+ ebob);

        // Ekok= (n1*n2)/ebob

        System.out.println("Ekok= " + ((n1*n2)/ebob));
    }
}
