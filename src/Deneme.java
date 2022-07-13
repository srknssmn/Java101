import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("please enter a value:");
        a= input.nextInt();

        boolean kosul= (a>-100)&&(a<=100);

        String sonuc= kosul ? "Good job" : "Wrong answer";
        System.out.println(sonuc);

    }
}