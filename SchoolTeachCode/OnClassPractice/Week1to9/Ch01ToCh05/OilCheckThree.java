package Week1to9.Ch01ToCh05;

import java.util.Scanner;

public class OilCheckThree {
    public static void main(String[] args) {
        Check();
    }

    public static void Check() {
        System.out.println("請輸入目前所剩油量(單位：公斤)；");

        Scanner sc =new Scanner(System.in);
        int  liter= sc.nextInt();

        if(liter >=2 && liter<5) {
            System.out.println("油量尚足，提醒您注意油表。");
        } else if (liter<2) {
            System.out.println("油量不足");
            System.out.println("該加油了！");
        }
        System.out.println("祝您行車愉快！");

    }
}
