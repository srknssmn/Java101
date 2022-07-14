package Odevler;
import java.util.Scanner;
public class gradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathematics,science,chemistry,grammar,music;
        double totalGrade=0.0;
        int passingGrade=55,totalLessons= 0;

        System.out.print("Enter your mathematics grade: ");
        mathematics=input.nextInt();
        if(mathematics>=0&&mathematics<=100){
            totalGrade+=mathematics;
            totalLessons++;
        }else{
            System.out.println("Invalid grade! ");
            }
        System.out.print("Enter your science grade: ");
        science=input.nextInt();
        if(science>=0&&science<=100){
            totalGrade+=science;
            totalLessons++;
        }else{
            System.out.println("Invalid grade! ");
            }
        System.out.print("Enter your chemistry grade: ");
        chemistry=input.nextInt();
        if(chemistry>=0&&chemistry<=100){
            totalGrade+=chemistry;
            totalLessons++;
        }else{
            System.out.println("Invalid grade! ");
            }
        System.out.print("Enter your grammer grade: ");
        grammar=input.nextInt();
        if(grammar>=0&&grammar<=100){
            totalGrade+=grammar;
            totalLessons++;
        }else{
            System.out.println("Invalid grade! ");
            }
        System.out.print("Enter your music grade: ");
        music=input.nextInt();
            if(music>=0&&music<=100){
                totalGrade+=music;
                totalLessons++;
            }else{
                System.out.println("Invalid grade! ");
            }
        double ort=totalGrade/totalLessons;
        System.out.println("Your grade point average: " +ort);

        if(ort>=passingGrade){
            System.out.print("Congratulations, you passed!");
        }else{
            System.out.print("Sorry, did not pass!");
        }
    }
}
