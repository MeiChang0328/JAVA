package ilearnCheckList;
import java.util.Scanner;
public class The5th {
    public static void main(String[] args) {
//        請讓使用者輸入一個分數
//        如果大於等於60請輸出pass
//        若是90分以上，請額外輸出excellent
//        50~59請輸出almost pass
//        否則輸出fail
        Scanner sc=new Scanner(System.in);
        int score= sc.nextInt();

        if (score>=90) {
            System.out.println("pass");
            System.out.println("excellent");
        }else if(score>=60){
            System.out.println("pass");

        } else if (score>=50&&score<60) {
            System.out.println("almost pass");

        }else {
            System.out.println("fail");

        }


    }
}
