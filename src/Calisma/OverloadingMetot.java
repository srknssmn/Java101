package Calisma;
public class OverloadingMetot {

    static void print(){
        System.out.println("Parametresiz metot");
    }
    static void print(int a){
        System.out.println("Parametre: " + a);
    }
    static int print(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        print();                                    // Parametre verilmeyen metodu çalıştırıyor.
        print(1);                                   // Parametre verilen metodu çalıştırıyor.
        System.out.println(print(1,2));       // 2 Parametre verilen int metodunu çalıştırıyor.
    }
}
