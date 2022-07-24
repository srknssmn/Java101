package Odevler;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total=0;
        System.out.print("Write a number: ");
        number = input.nextInt();

        for (int i=1; i<number;i++) {
            if(number%i==0){
                total+=i;
            }
        }
          if (number==total){
              System.out.print(total + " - Good job, this is a perfect number!");
          } else {
              System.out.print(total + " - Sorry, this is not a perfect number!");
          }
    }
}
