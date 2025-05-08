package Week1to9.Ch06;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fact;
        double range;
        System.out.println("請輸入您需要的數字，僅能輸入1-170之間的數，我們會將其輸入的數字計算，得到所有的乘階");

        while (!sc.hasNextInt()) {
            System.out.println("僅能輸入正數字請重新輸入");
            sc.next();
        }
        range=sc.nextInt();


        while (range<=0||range>170) {
            System.out.println("所輸入的數字條件只能介於1~170之間");
            System.out.println("請重新輸入數字範圍");
            while (!sc.hasNextInt()) {
                System.out.println("僅能輸入數字請重新輸入");
                sc.next();
            }
            range=sc.nextInt();
        }

        int num =(int)range;

        for (fact = 1; range > 1; range--) {
            fact *=range;

        }

        System.out.println("您所輸入的數字範圍為"+num+"，計算"+num+"!得出的答案科學記號為"+fact);


    }
}