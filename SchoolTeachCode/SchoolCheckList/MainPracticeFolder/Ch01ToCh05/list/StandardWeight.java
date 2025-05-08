package Ch01ToCh05.list;

import java.util.Scanner;

public class StandardWeight {
    public static void main(String[] args) {
        caculate();
    }

    public static void caculate() {
        double weight;

        System.out.println("現在要計算您的性別及身高輸出您應對應的標準體重");
        System.out.println("請先數入您的性別，請輸入'男','女'");
        Scanner sc = new Scanner(System.in);
        String sex= sc.next();
        System.out.println("請輸入您的身高");
        double height = sc.nextDouble();



        switch (sex){
            case "男":
                weight=(height-80)*0.7;
                if (height>80){
                    System.out.println("您所對應的體重應該是"+weight);
                }else {
                    System.out.println("此計算公式僅適用於身高大於80的人");
                }
                break;

            case "女":
                weight=(height-70)*0.6;
                if(height>70){
                    System.out.println("您所對應的體重應該是"+weight);
                }else {
                    System.out.println("此計算公式僅適用於身高大於70的人");
                }
                break;
            default:
                System.out.println("您所輸入的性別錯誤");
        }

    }
}
