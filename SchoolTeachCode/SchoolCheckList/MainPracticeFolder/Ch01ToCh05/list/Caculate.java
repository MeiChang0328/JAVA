package Ch01ToCh05.list;

import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {
        chose();
    }

    public static void chose() {

        System.out.println("請你輸入兩個數字");
        System.out.println("第一個數字為？");
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        System.out.println("第二個數字為？");
        double second = sc.nextDouble();
        System.out.println("您輸入的第一個數字是："+first+"，第二個數字是："+second);

        System.out.println("請輸入你想要對該數，所做的四則運算，可直接輸入'+','-','*','/'");
        String sign = sc.next();
        switch (sign){
            case "+":
                double sum=first+second;
                System.out.println("您所輸入的兩數相加為"+sum);
                break;
            case "-":
                double Subtraction=first-second;
                System.out.println("您所輸入的兩數相減為"+Subtraction);
                break;
            case "*":
                double multiplication=first*second;
                System.out.println("您所輸入的兩數相乘為"+multiplication);
                break;
            case "/":
                if(second!=0){
                    double vision=first/second;
                    System.out.println("您所輸入的兩數相除為"+vision);
                }else {
                    System.out.println("除數的分母不可等於0");
                }
                break;

            default:
                System.out.println("輸入錯誤的四則運算符號");
        }
    }
}
