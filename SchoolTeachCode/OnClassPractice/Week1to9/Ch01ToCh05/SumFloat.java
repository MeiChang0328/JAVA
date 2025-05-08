package Week1to9.Ch01ToCh05;

import java.util.Scanner;

public class SumFloat {
  public static void main(String[] args) {
      System.out.println("請輸入第一個浮點數:");
      Scanner sc= new Scanner(System.in);
      float num1=sc.nextFloat();

      System.out.println("請輸入第二個浮點數:");
      float num2=sc.nextFloat();

      System.out.println("兩數和為:"+(num1+num2));
      System.out.println("兩數乘為:"+(num1*num2));

  }
}
