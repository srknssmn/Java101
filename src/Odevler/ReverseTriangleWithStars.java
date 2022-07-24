package Odevler;
import java.util.Scanner;
public class ReverseTriangleWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i=0; i<=n; i++){
            for( int i1=1; i1<=(n-(n-i)); i1++){
                System.out.print(" ");
            }
            for(int l=1; l<=(((n - i) * 2) - 1); l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
