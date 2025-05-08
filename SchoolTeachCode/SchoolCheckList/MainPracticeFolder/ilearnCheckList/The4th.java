package ilearnCheckList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class The4th {
    public static void main(String[] args) {
//        寫一個程式用 for 迴圈來找出輸入的十個數字的最大值和最小值，數值不限定為整數，且值可存放於 float 型態數值內。
        Scanner sc=new Scanner(System.in);
        float[] nums=new float[10];
        for (int i = 0; i < nums.length; i++) {
         nums[i]=sc.nextFloat();
        }
        float temp;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("max:"+" "+df.format(nums[9])+"\n"+"min:"+" "+df.format(nums[0]));


    }
}
