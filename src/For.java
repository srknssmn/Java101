import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // for(durum 1; durum 2; durum 3){kod}
        // ilk olarak 1. durum çalışıyor, sonra 2. durum çalışıyor. 2.durum sağlanıyorsa kod yazılıyor.
        // Kodu yazdıktan sonra 3. durum çalışıyor, eğer 2. durumu karşılıyorsa kod tekrar yazılıyor.
        // Kod 2.durum karşılandığı sürece yazdırılıyor.

        // FOR DONGUSU
        //for(int i=1; i<=12; i+=2) {
         //   System.out.print(i + "\t");
           //              }
        /*
        for(int i=1; i<=12; i+=2) {
            System.out.print(i + "\t");
            while(i==7){
                System.out.print("go go go" + " ");
                i++;
            }
        } */

        // WHILE DONGUSU
        /*System.out.println();
        int k=1;
        while (k<=10){
            System.out.print(k + "\t");
            k+=2;
        }*/

        /*
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
i=0 j=0 sum=0
        i=1 j=2
        sum=1
        i=2 j=3
        sum=3
        i=3 j=4
        sum=6
        i=4 j=5
        sum=10
        i=5 j=6 (2.durum sağlanmadığı için koddan çıkıyor.)
sout= sum en son 10 olduğu için 10 olarak yazdırıldı.
 */
        for(int i=7;i<=77;i+=7 ){
            System.out.print(i + " ");
        }
    }
}


