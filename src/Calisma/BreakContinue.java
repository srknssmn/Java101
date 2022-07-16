package Calisma;

public class BreakContinue {
    public static void main(String[] args) {
        /*
        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        */
        /*
        for(int i=1;i<=10;i++){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        // NOT: Continue 'nun altındakini yapmadan başa dönüyor.
        */
        /*
        int i=0;
        while (i<20){
            i++;
            if(i%2==0){
                continue;
            } System.out.println(i);
        }
        */
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1)
                    continue;
                System.out.print(i + j);
            }
        }
    }
}
