package CH06.list;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class TheEndTest08PartTwo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入四位數密碼");
        String num = sc.next();

        while (num.length() != 4) {
            System.out.print("請正確設置第一次的密碼");
            num=sc.next();
        }
        System.out.println("已經正確設置密碼為："+num);
        System.out.println("請再次輸入密碼以利驗證第一次的輸入是否正確");


        for (int i = 0; i < 3; i++) {
            String num2 = sc.next();

            if (num.equals(num2) ) {
                System.out.print("您輸入的密碼已驗證成功");
                return;
            } else {
                System.out.print("密碼錯誤");
            }
        }
        System.out.print("三次，無法再繼續嘗試。");
    }
}
