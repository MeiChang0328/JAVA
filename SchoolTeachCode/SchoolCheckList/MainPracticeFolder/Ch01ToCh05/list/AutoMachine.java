package Ch01ToCh05.list;

import java.util.Scanner;
public class AutoMachine {
    public static void main(String[] args) {
        Caculate();
    }
    public static void Caculate() {
        int money;
        int ten;
        int five;
        int one;
        System.out.println("請輸入金額：");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();

        if(money <1000&&money>0) {
            ten=money/10;
            five=(money-ten*10)/5;
            one=money-ten*10-five*5;
            System.out.println("十元硬幣有:"+ten+"個");
            System.out.println("五元硬幣有:"+five+"個");
            System.out.println("十元硬幣有:"+one+"個");
        } else if (money>1000) {
            System.out.println("金額過大");
        } else {
            System.out.println("請輸入正確金額!");
        }
    }

}

