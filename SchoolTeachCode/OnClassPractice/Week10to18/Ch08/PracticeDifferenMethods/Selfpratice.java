package Week10to18.Ch08.PracticeDifferenMethods;
import java.util.Scanner;
public class Selfpratice {
    public static void main(String[] args) {

        System.out.println("請輸入成績：");
        Scanner sc=new Scanner(System.in);


        while (sc.hasNext()){
            while (!sc.hasNextInt()){
                System.out.println("請輸入數字");
                sc.next();
            }
            int score=sc.nextInt();

            if(score >= 0 && score <= 100){
                if (score >= 90 && score <= 100) {
                    System.out.println("A");
                    return;

                } else if (score >= 80&&score<90) {
                    System.out.println("B");
                    return;

                } else if (score >= 70&&score<80) {
                    System.out.println("C");
                    return;

                } else if (score >= 60&&score<70) {
                    System.out.println("D");
                    return;

                } else if(score >0 && score<60){
                    System.out.println("F");
                    return;
                }
            }else{
                    System.out.println("輸入錯誤成績格式，請重新輸入");
            }
        }
    }
}
