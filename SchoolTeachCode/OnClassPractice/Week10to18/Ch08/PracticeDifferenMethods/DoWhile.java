package Week10to18.Ch08.PracticeDifferenMethods;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        boolean valid;

        do{
            valid=true;
            System.out.println("請輸入成績");

            int score = sc.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("A");

            } else if (score >= 80 && score < 90) {
                System.out.println("B");


            } else if (score >= 70 && score < 80) {
                System.out.println("C");


            } else if (score >= 60 && score < 70) {
                System.out.println("D");

            } else if (score > 0 && score < 60) {
                System.out.println("F");
            } else {
                System.out.println("請輸入1~100之間");
                valid = false;

            }

        }while(!valid);
    }
}
