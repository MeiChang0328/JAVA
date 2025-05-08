package Week10to18.Ch08.hookgame;
import java.io.BufferedReader;
import java.util.*; //類似include 引進相關之物件來用

public class Main { //類別名稱, Java為物件導向語言
    public static void main(String[] args) { //程式進入點, 可有多個
        int count = 0, input = 0; //資料的宣告
        boolean success = true;
        boolean[] bucket = new boolean[10]; //陣列的宣告
        boolean[] knifes = new boolean[bucket.length];
        // true 已插刀, false 未插刀, bucket.length為bucket參數=10

        bucket[new Random().nextInt(bucket.length)] = true;
        // 利用Random物件, 隨機置入一個死亡在bucket中
        Scanner scanner = new Scanner(System.in);
        //產生一個輸入物件 scanner

//            若三次內就找到HOOK所在位置就顯示: 你真是太神奇了.
//            若五次內找到HOOK所在位置就顯示: 你通過了.
//            若第五次還是沒找到HOOK所在位置就顯示: 你輸了GG

        while (success && count < 5) {// 未死亡且未滿五刀, 流程控制
            // 秀出沒有刀的洞
            for (int i = 0; i < knifes.length - 1; i++) //流程控制
                if (!knifes[i])   System.out.print(i + ", "); //判斷, 利用System 物件輸出
            if (!knifes[knifes.length - 1]) //因最後一個洞後就不印”,”了
                System.out.println(knifes.length - 1);

            input = scanner.nextInt();// 取得user的下一刀的位置(一個整數), 輸入

            if (input < 0 || input > bucket.length || knifes[input])
            // 刀插到外面或已有刀
                continue;// 重插
            knifes[input] = true; // 插入刀子
            success = !bucket[input];// true死亡, false安全
            count++;
            if (count<=3&&success==false){
                System.out.println("你真是太神奇了");
                break;
            }else if (count<=5&&success==false){
                System.out.println("你通過了");
                break;
            }else if(count==5&&success==true){
                System.out.println("你gg了");
                break;
            }
        }
    }
}


