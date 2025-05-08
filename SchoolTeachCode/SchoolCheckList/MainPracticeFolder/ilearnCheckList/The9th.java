package ilearnCheckList;
import java.util.*;


public class The9th {
    public static void main(String[] args) {
//        判斷是否為迴文
    Scanner sc=new Scanner(System.in);
    String x = sc.next();
    char[] z=x.toCharArray();

    char[] b=new char[z.length/2];
    char[] a=new char[z.length/2];


    for (int i = 0; i < z.length/2; i++) {
        b[i]= z[i];
    }

    for (int j = 0; j < z.length/2; j++) {
        a[j]=z[z.length-1-j];
    }

    System.out.println(Arrays.equals(a,b)?"true":"false");








    }
}
