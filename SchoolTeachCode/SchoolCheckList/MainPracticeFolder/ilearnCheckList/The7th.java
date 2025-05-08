package ilearnCheckList;
import java.util.Scanner;

public class The7th {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];

        int x = sc.nextInt();


        a[0]=x / 1000;
        a[1]=(x / 100) % 10;
        a[2]=(x / 10) % 10;
        a[3]=x % 10;

        for (int i = 0; i < a.length; i++) {
            a[i]= (a[i]+7)%10;
        }

        int temp;
        temp=a[0];
        a[0]=a[2];
        a[2]=temp;

        temp=a[1];
        a[1]=a[3];
        a[3]=temp;

        for (int b:a){
            System.out.print(b);
        }


    }
}
