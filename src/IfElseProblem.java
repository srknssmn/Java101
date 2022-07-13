import java.util.Scanner;

public class IfElseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //En küçük sayı hangisidir?

        int a= 5, b=4, c=3;

        if(a<b&&a<c){
            System.out.println("En Kucuk Sayi A Sayisidir.");
        }else if(b<a&&b<c) {
            System.out.println("En Kucuk Sayi B Sayisidir.");
        }else {
            System.out.println("En Kucuk Sayi C Sayisidir.");
        }

    }
}
