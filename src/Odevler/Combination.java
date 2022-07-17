package Odevler;
import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        int n,r,i=1,j=1,total1=1,total2=1;

        System.out.print("N elemanini giriniz: ");
        n=input.nextInt();
        System.out.print("r elemanini giriniz: ");
        r=input.nextInt();

        while (i<=n){
            total1=total1*i;
            i++;
        }
        while (j<=r){
            total2=total2*j;
            j++;
        }
        int k=1,total3=1;
        while (k<=(n-r)){
            total3=total3*k;
            k++;
        }
        if(n>r) {
            int combination = total1 / (total2 * total3);
            System.out.print("N ’in r ’li kombinasyonu C(n,r): " + combination);
        }else{
            System.out.println("N r den buyuk olmalidir.");
        }
    }
}
