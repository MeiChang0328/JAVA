package Ch01ToCh05.list;

import java.util.Scanner;
public class JudgeNum {
    public static void main(String[] args) {
        caculate();
    }
    public static void caculate() {
        int Num;
        System.out.println("請輸入一個數字");
        Scanner sc = new Scanner(System.in);
        Num=sc.nextInt();

        if(Num>0) {
            if (Num % 2 == 0) {
                System.out.println("輸入數字：" + Num + "，為偶數");
            } else if (Num % 2 == 1) {
                System.out.println("輸入數字：" + Num + "，為奇數");
            }
        }else {
            System.out.println("請輸入大於零的正數字");
        }
    }
}
