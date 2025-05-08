package Week1to9.Ch06;

import java.util.Scanner;

//判斷sc中得到的資料，是否為所需的資料型態
public class HasNext {
    public static void main(String[] args) {
        int sum,range;
        sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入您要的範圍(正整數)，以利加總所有的奇數");

        while (!sc.hasNextInt()){//設定迴圈，若非整數 就持續執行回圈內容 直到得到正確數字
            System.out.println("輸入的數字須為整數，請重新輸入");
            sc.next();//清除剛剛輸入的內容
        }


        range = sc.nextInt();

        for (int i =1;i<= range;i+=2){
            sum+=i;
        }
        System.out.println("到您指定的範圍，所有的奇數總和為"+sum);

    }
}
