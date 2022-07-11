public class Main {
    public static void main(String[] args) {
        /*
         * @author Serkan Sitki Sisman
         */

        // Yorum satırı
/*
        Yorum Bölümü
        Yorum Bölümü
*/


        System.out.println("GO GO GO\nPusula Finans");
        System.out.println("Pusula Finans");

        int numberOne, numberTwo = 5, numberThree;
        numberOne = 20;

        numberThree = numberOne + numberTwo;

        System.out.println(numberThree);

        int kisaKenar=10;
        int uzunKenar=20;

        int cevre = 2*(kisaKenar+uzunKenar);
        int alan = kisaKenar*uzunKenar;

        System.out.println(cevre);
        System.out.println(alan);

        byte tamSayi1 = 100;
        System.out.println(tamSayi1);

        short tamSayi2 = 15000;
        System.out.println(tamSayi2);

        int tamSayi3 = 150000;
        System.out.println(tamSayi3);

        float ondalikSayi1 = 1.5f;
        System.out.println(ondalikSayi1);

        double ondalikSayi2 = 3.14;
        System.out.println(ondalikSayi2);

        float t, x;

        t = 35+5;
        x = t/4;

        System.out.println(x);

        boolean dogru = true;
        boolean yanlis = false;

        System.out.println(dogru);
        System.out.println(yanlis);

        int ilk = 7;
        int ikinci = 17;
        int carpim = ilk*ikinci;

        System.out.println(ilk*ikinci);
        System.out.println(carpim);

        String yazi = "Serkan Sitki Sisman";
        System.out.println(yazi);


        int a=5,b=2,c=5;

        boolean sonuc = a==b;
        System.out.println(sonuc);
        boolean sonuc1 = a>b;
        System.out.println(sonuc1);
        boolean sonuc2 = a>=b;
        System.out.println(sonuc2);
        boolean sonuc3 = a!=b;
        System.out.println(sonuc3);

        boolean kosul1 = a==c;
        boolean kosul2 = a>b;
        boolean sonucc = kosul1&&kosul2;
        System.out.println(sonucc);

        boolean kosul11 = a==b;
        boolean kosul22 = a==c;
        boolean sonucc1 = kosul11||kosul22;
        boolean sonucc2 = kosul11&&kosul22;

        System.out.println(sonucc2);
        System.out.println(!sonucc2);

        String yeniKosul = sonucc ? "Dogru" : "Yanlis";
        System.out.println(yeniKosul);

        int yeniKosul1 = sonucc ? 1 : 2;
        System.out.println(yeniKosul1);

        String yeniSonuc = a==c ? "Dogru" : "Yanlis";
        System.out.println(yeniSonuc);

        byte bb = 0;

        int ab = bb--;

        System.out.println(ab);


    }
}
