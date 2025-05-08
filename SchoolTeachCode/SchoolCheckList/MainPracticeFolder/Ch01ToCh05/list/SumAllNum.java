package Ch01ToCh05.list;

import java.util.Scanner;
public class SumAllNum {
    public static void main(String[] args) {
        caculate();
    }
    public static void caculate() {
        int Num;
        int j=0;
        System.out.println("請輸入一個數字");
        Scanner sc = new Scanner(System.in);
        Num=sc.nextInt();

        for (int i= 0; i<=Num;i++){
            j+=i;
        }
        System.out.println("從1加到"+Num+"的數字總合為；"+j);
    }
}
