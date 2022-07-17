package Calisma;
import java.util.Scanner;
public class UssuAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        /*
        int a,b,c;
        System.out.print("Ussu alinacak sayiyi yaziniz: ");
        a = input.nextInt();
        System.out.print("Us sayisini yaziniz: ");
        b = input.nextInt();

        if (b > 1) {
            c = a * a;
            for (int i = 2; i < b; i++) {
                c *= a;
            }
            System.out.print(c);
        }else if(b==1){
            c=a*1;
            System.out.print(c);
        }else if(b==0){
            System.out.print("1");
        }else{
            System.out.print("Eksi deger girilemez!");
        }
         */
        /*
        int n,k;
        n= input.nextInt();
        k= input.nextInt();

        int i=1,total=1;

        while(i<=k){
            total*=n;
            i++;
        }
        System.out.println(total);
        */

        int a,b,c;

        System.out.print("Ussu alinacak sayiyi yaziniz: ");
        a = input.nextInt();
        System.out.print("Us sayisini yaziniz: ");
        b = input.nextInt();
        c=1;

        for(int i=1;i<=b;i++){
            c*=a;
        }
        System.out.println(c);
    }
}