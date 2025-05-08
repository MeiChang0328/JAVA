package CH06.list;
import java.util.Scanner;
public class TheEndTest06 {
    public static void main(String[] args) {
        int x,y=0;
        System.out.println("請輸入您需要的矩形大小");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();


        for (int i = 0; i < x; i++) {
            System.out.print("!" +"\t");

            for (int j=1;j<x;j++){
                System.out.print("*"+"\t");

            }
            System.out.print("\n");
        }
    }
}
