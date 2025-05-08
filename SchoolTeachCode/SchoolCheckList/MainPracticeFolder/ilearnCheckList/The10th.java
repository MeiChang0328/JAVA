package ilearnCheckList;
import java.util.Scanner;

public class The10th {
    public static void main(String[] args) {
//    撰寫⼀個程式，要求使⽤者輸⼊兩個數字，再從使⽤者取得這兩個數字，然後印出這
//    兩個數字的總和、乘積、差、商、和餘數。
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"/"+b+"="+(a/b)+"..."+(a%b));

    }
}
