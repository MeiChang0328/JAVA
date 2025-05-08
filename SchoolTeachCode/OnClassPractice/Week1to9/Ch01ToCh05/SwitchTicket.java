package Week1to9.Ch01ToCh05;

import java.util.Scanner;

public class SwitchTicket {

    public static void main(String[] args) {
        check();
    }

    public static void check() {

        System.out.println("請輸入你需要的票卷：");
        System.out.println("1.全票，2.優待票，3.星光票");
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();

        switch (ticket){
            case 1:
                System.out.println("全票：399元");
                break;
            case 2:
                System.out.println("優待票：199元");
                break;
            case 3:
                System.out.println("星光票：249元");
                break;
            default:
                System.out.println("輸入錯誤。");

        }
    }


}
