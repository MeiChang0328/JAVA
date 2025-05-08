package ilearnCheckList;
import java.util.Scanner;

public class TheFirst {
    public static void main(String[] args) {

        int sum01=0;
        int sum02=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入十個數字以形成一個陣列");
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < x.length ; i+=2) {
            sum02+=x[i];
        }
        for (int i = 1; i < x.length ; i+=2) {
            sum01+=x[i];
        }
        System.out.print(sum02+","+sum01);

    }
}
