package ilearnCheckList;
import java.util.Scanner;

public class The6th {
    public static void main(String[] args) {
//        樹葉部分:
//        高:n
//        寬:n*2-1
//
//        樹幹部分:
//        3*3
//        樹葉和樹幹中間要對齊
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        for (int i = 0; i < x; i++) {
            int a =i*2+1;
            for (int j = x-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < a ;k++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for (int i = 0; i < 3; i++) {
            int y=((x*2)-4)/2;
            for (int q = 0; q <y ; q++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
