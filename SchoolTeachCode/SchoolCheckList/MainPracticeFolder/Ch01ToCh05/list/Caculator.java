package Ch01ToCh05.list;

import java.util.Scanner;
public class Caculator  {
    public static void main(String[] argv) {
        Calulate();
    }
    public static void Calulate() {
        int Num;
        int num1;
        int num2;
        System.out.println("請輸入一個數字");
        Scanner sc=new Scanner(System.in);
        Num=sc.nextInt();

        num1=Num/13;
        num2=Num%13;
        System.out.println("所輸入的數除13的商數為:"+num1+"，餘數為："+num2);

    }
}
