package Odevler;
import java.util.Scanner;
public class OrderOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to write: ");
        int n = input.nextInt();
        int biggestNumber=0,smallestNumber=0, a;

        for (int i=1; i<=n; i++){
            System.out.print(i + ". Number: ");
            int n1 = input.nextInt();

            if(i==1){
                biggestNumber=n1;
                smallestNumber=n1;
            }
            if(n1>biggestNumber){
                biggestNumber=n1;
            }
            if (n1<smallestNumber) {
                smallestNumber = n1;
            }
        }
        System.out.println("Biggest Number is " + biggestNumber);
        System.out.println("Smallest Number is " + smallestNumber);
    }
}
