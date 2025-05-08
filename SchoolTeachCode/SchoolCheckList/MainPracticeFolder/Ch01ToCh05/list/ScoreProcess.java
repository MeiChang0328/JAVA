package Ch01ToCh05.list;

import java.util.Scanner;
public class ScoreProcess {
    public static void main(String[] args) {
        ProcessCheck();
    }

    public static void ProcessCheck() {
        int score;
        System.out.println("請輸入成績：");
        Scanner sc = new Scanner(System.in);
        score=sc.nextInt();

        if (score<=100 && score>=0){
            if ( score>=90) {
                System.out.println("A");
            }else if(score>=80){
                System.out.println("B");
            }else if(score>=70){
                System.out.println("C");
            }else if(score>=60){
                System.out.println("D");
            }else {
                System.out.println("不及格");
            }
        } else{
            System.out.println("輸入錯誤");
        }
    }
}
