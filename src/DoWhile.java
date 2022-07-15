import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int pass;
        boolean kosul=true;

        do{
            System.out.print("Sifrenizi giriniz: ");
            pass=input.nextInt();
            if(pass==123){
                System.out.print("Sifre dogru");
                kosul=false;
            }else{
                System.out.print("Yanlis Tekrar ");
            }
        }while(kosul);
    }
}
