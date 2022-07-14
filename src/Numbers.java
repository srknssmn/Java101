import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        System.out.println("Type 3 numbers to sort");

        System.out.print("First Number: ");
        a=input.nextInt();
        System.out.print("Second Number: ");
        b=input.nextInt();
        System.out.print("Third Number: ");
        c=input.nextInt();

        if(a>b&&a>c){
            System.out.println("Largest Number: "+a);
            if(b>c){
                System.out.println("Second Number: "+b);
                System.out.println("Third Number: "+c);
            }else {
                System.out.println("Second Number: "+c);
                System.out.println("Third Number: "+b);
            }
        }else if(b>a&&b>c){
            System.out.println("Largest Number: "+b);
            if(a>c){
                System.out.println("Second Number: "+a);
                System.out.println("Third Number: "+c);
            }else{
                System.out.println("Second Number: "+c);
                System.out.println("Third Number: "+a);
            }
        }else{
            System.out.println("Largest Number: "+c);
            if(a>b){
                System.out.println("Second Number: "+a);
                System.out.println("Third Number: "+b);
            }else{
                System.out.println("Second Number: "+b);
                System.out.println("Third Number: "+a);
            }
        }
    }
}
