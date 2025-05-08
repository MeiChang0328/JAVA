package CH06.list;
import java.util.Scanner;

public class TheEndTest03 {
    public static void main(String[] args) {
        int x,y,sum=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("我們將會計算您給出的兩個數，加總其中所有數的總和");
        System.out.println("請輸入您要計算的第一個數");
        x=sc.nextInt();
        System.out.println("請輸入您要計算的最後一個數");
        y= sc.nextInt();

        if (x<y) {
            while (x<=y){
                sum += x;
                x++;

            }
            System.out.println("您所輸入的數加總為" + sum);

        }else if (x>y){
            while (x>=y){
                sum2+=x;
                x--;
            }
            System.out.println("您所輸入的數加總為"+sum2);

        }else if(x==y){
            System.out.println("輸入的兩個數不能相等");
        }
    }
}
