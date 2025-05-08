package Ch01ToCh05.list;

import java.util.Scanner;
public class RabbitChicken {
    public static void main(String[] args) {
        caculate();
    }

    public static void caculate(){
        int headNum;
        int footNum;
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入現在有幾個頭");
        headNum=sc.nextInt();
        System.out.println("請輸入現在有幾隻腳");
        footNum=sc.nextInt();
        y=(footNum-headNum*2)/2;
        x=(headNum*4-footNum)/2;

        if (x < 1 || y < 1) {
            System.out.println("此數無解");
        } else{
            System.out.println("現在雞有" + x+"隻");
            System.out.println("現在兔子有" + y+"隻");
        }
    }
}
