package ilearnCheckList;
import java.util.Scanner;
public class TheThird {
    public static void main(String[] args) {
//        請設計程式，根據輸⼊之及⽇期，輸出對應之星座輸出。
//
//1⽉ 21⽇ ~ 2⽉ 18⽇ ⽔瓶 ( Aquarius)
//2⽉ 19⽇ ~ 3⽉ 20⽇ Pisces (Pisces)
//3⽉ 21⽇ ~ 4⽉ 20⽇ 牡⽺ (Aries)
//4⽉ 21⽇ ~ 5⽉ 21⽇ ⾦⽜ (Taurus)
//5⽉ 22⽇ ~ 6⽉ 21⽇ 雙⼦ (Gemini)
//6⽉ 22⽇ ~ 7⽉ 22⽇ Cancer (Cancer)
//7⽉ 23⽇ ~ 8⽉ 23⽇ Leo (Leo)
//8⽉ 24⽇ ~ 9⽉ 23⽇ 處⼥ (Virgo)
//9⽉ 24⽇ ~ 10⽉ 23⽇ Libra (Libra)
//0⽉ 24⽇ ~ 11⽉ 22⽇ Scorpio (Scorpio)
//1⽉ 23⽇ ~ 12⽉ 21⽇ 射⼿ (Sagittarius)
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        String y=Integer.toString(x);

        int q =sc.nextInt();


        switch (y){
            case "1":
                if(q>20&&q<32){
                    System.out.println("Aquarius");
                }else if (q>0 && q<21){
                    System.out.println("Capricorn");
                }
                break;
            case "2":
                if(q>18 && q<30){
                    System.out.println("Pisces");
                }else if (q>0 && q<19){
                    System.out.println("Aquarius");
                }
                break;
            case "3":
                if(q>20 && q<32){
                    System.out.println("Aries");
                }else if (q>0 && q<21){
                    System.out.println("Pisces");
                }
                break;
            case "4":
                if(q>20 && q<31){
                    System.out.println("Taurus");
                }else if (q>0 && q<21){
                    System.out.println("Aries");
                }
                break;
            case "5":
                if(q>21&& q<32){
                    System.out.println("Gemini");
                }else if (q>0 && q<22){
                    System.out.println("Taurus");
                }
                break;
            case "6":
                if(q>21 && q<31){
                    System.out.println("Cancer");
                }else if (q>0 && q<22){
                    System.out.println("Gemini");
                }
                break;

            case "7":
                if(q>22 && q<32){
                    System.out.println("Leo");
                }else if (q>0 && q<23){
                    System.out.println("Cancer");
                }
                break;
            case "8":
                if(q>23 && q<32){
                    System.out.println("Virgo");
                }else if (q>0 && q<24){
                    System.out.println("Leo");
                }
                break;

            case "9":
                if(q>23 && q<31) {
                    System.out.println("Libra");
                }else if (q>0 && q<24){
                    System.out.println("Virgo");
                }
                break;

            case "10":
                if(q>23 && q<32){
                    System.out.println("Scorpio");
                }else if (q>0 && q<24){
                    System.out.println("Libra");
                }
                break;

            case "11":
                if(q>22 && q<31){
                    System.out.println("Sagittarius");
                }else if (q>0 && q<23){
                    System.out.println("Scorpio");
                }
                break;

            case "12":
                if(q>21&& q<32){
                    System.out.println("Capricorn");
                }else if (q>0 && q<22){
                    System.out.println("Sagittarius");
                }
                break;

        }
    }
}
