package ilearnCheckList;
import java.util.Scanner;

public class The11th {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        for (int i = 0; i <= b; i++) {
            System.out.print(String.format("%5d", i));

            for (int j = i+1; j <= a; j++) {
                System.out.print(String.format("%5d", j));
            }
            System.out.println();
            a=a+1;
        }
    }
}
