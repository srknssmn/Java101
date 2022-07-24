package Calisma;
public class Metot {

    static void helloWorld(){
        System.out.print("Hello World!");
    }
    static int power (int base, int exp){                // Class icerisinde metot tanımlama.
        int total = 1;
        for (int i=1; i<=exp; i++){
            total*=base;
        }
        return total;
    }
    public static void main(String[] args) {

        System.out.println(power(2,3));

        int case1 = power(3,4);
        System.out.println(case1);

        helloWorld();                 // Metodu cagirma fonksiyonu!

    }
}
