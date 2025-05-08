package ilearnCheckList;
import java.util.Scanner;

public class The8thpartTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a >= 1 && a <= 200) {
                int sum = a;
                a++;
                while (a > 0) {

                    int b = a / 3;
                    int c = a % 3;
                    sum += b;


                    b += c;


                    if (b >= 3) {
                        a = b;
                    } else if (b < 3) {
                        a = 0;
                    }
                }
                System.out.println(sum);

            }else {
                break;
            }

        }
    }
}
