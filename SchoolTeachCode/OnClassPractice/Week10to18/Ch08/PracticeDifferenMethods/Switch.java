package Week10to18.Ch08.PracticeDifferenMethods;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("請輸入成績：");
        Scanner sc =new Scanner(System.in);
        boolean valid;
        do{
            valid=true;
            int score= sc.nextInt();
            if (score<0||score>100){
                valid=false;
                System.out.println("請輸入0~100");
                continue;

            }
            int level=score/10;

            switch (level){
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("F");
                    break;
            }
        }while (!valid);



    }
}
