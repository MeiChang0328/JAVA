package CH06.list;

import java.util.Scanner;


public class TheEndTest08 {
    public static void main(String[] args) {
        int num, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼");

        while (!sc.hasNextInt()){
            System.out.print("請正確設置第一次的密碼");
            sc.next();
        }
        num = sc.nextInt();
        System.out.println("請再次輸入密碼以利驗證");

        for (int i = 0; i < 3; i++) {

            if (!sc.hasNextInt()) {
                System.out.print("密碼錯誤");
                sc.next();
                continue;
            }
            num2 = sc.nextInt();
            if (num==num2 ) {
                System.out.print("您輸入的兩次密碼已驗證成功");
                return;
            } else {
                System.out.print("密碼錯誤");
            }
        }
        System.out.print("，已無法再繼續嘗試");
    }
}