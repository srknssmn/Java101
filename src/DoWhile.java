import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        /*
        int pass;
        boolean kosul=true;

        do{
            System.out.print("Sifrenizi giriniz: ");
            pass=input.nextInt();
            if(pass==123){
                System.out.print("Sifre dogru");
                kosul=false;
            }else{
                System.out.println("Yanlis");;
            }
        }while(kosul);
        */

        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}
