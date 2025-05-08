package Week1to9.Ch01ToCh05;

import java.util.*;
import java.io.*;

public class PhoneInfo {
    public static void main(String[] args) throws IOException{

        System.out.println("現在要進行手機年份的判斷");
        System.out.println("請輸入你的手機序號第四碼");

        Scanner sc = new Scanner(System.in);
        String word =sc.next();
        word = word.toUpperCase();

        switch (word){
            case "M": case "N":
                System.out.println("2014年");
                break;
            case "P": case "Q":
                System.out.println("2015年");
                break;
            case "R": case "S":
                System.out.println("2016年");
                break;
            case "T": case "V":
                System.out.println("2017年");
                break;
            case "W": case "X":
                System.out.println("2018年");
                break;
            case "Y": case "Z":
                System.out.println("2019年");
                break;
            case "C": case "D":
                System.out.println("2020年");
                break;
            case "F": case "G":
                System.out.println("2021年");
                break;
            case "H": case "J":
                System.out.println("2022年");
                break;
            case "K": case "L":
                System.out.println("2023年");
                break;
            default:
                System.out.println("您輸入的序號有誤");

        }
    }
}
