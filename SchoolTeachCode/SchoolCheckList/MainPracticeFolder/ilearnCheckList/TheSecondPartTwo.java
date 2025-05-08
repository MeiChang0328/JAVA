package ilearnCheckList;

import java.util.Scanner;
public class TheSecondPartTwo {
    public static void main(String[] args) {
//   寫一個java 語言程式，使用者輸入10個，0-9的數字，需要找出輸入中出現次數最多的數字，並顯示該數字及其出現的次數。
//        1 2 3 3 3 4 5 6 6 7-->3,3
//        1 1 1 4 4 7 4 6 4 4-->4,5
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
            if (nums[i]>=10 ||nums[i]<0) {
                System.out.println("Out of range");
                return;
            }
        }

        int[] arrcount={0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    arrcount[i]++;
                }
            }
        }

        int countMax=arrcount[0];
        int arrMax=nums[0];
        for (int i = 0; i < arrcount.length; i++) {
            if (countMax<arrcount[i]){
                countMax=arrcount[i];
                arrMax=nums[i];
            }
        }
        System.out.println(arrMax+","+countMax);






    }
}
