package CH06.list;

import java.util.Scanner;

public class TheEndTest07 {
    public static void main(String[] args) {
        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入您需要的中間寬度菱形大小");
        x=sc.nextInt();

        for (int i =0;i<x;i++){
            for (int k=x;k>i;k--){
                System.out.print(" ");
            }
            for (int j =0;j<i;j++){
                System.out.print("#"+" ");
            }
            System.out.print("\n");
        }

        for (int i =0;i<=x;i++){
            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j=x;j>i;j--){
                System.out.print("#"+" ");
            }
            System.out.print("\n");
        }
    }
}
