package CH06.list;
import java.io.*;

public class isPrime {
    public static void main(String[] args) throws IOException{
        int num,range;
        boolean isPrime;
        isPrime =true;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入您需要判斷是否為質數的正整數字？");
        String text =br.readLine();
        num = Integer.parseInt(text);

        range=num/2;

        if(num>1) {

            for (int i = 2; i <= range; i++) {
                if (num % i == 0) {
                    if (isPrime == true) {
                        isPrime = false;
                        System.out.print("您輸入的數字並非質數，可以被"+i);
                    } else {
                        System.out.print(" " + i);
                    }
                }
            }

            if (isPrime) {
                System.out.println("您輸入的數字是質數，找不到可以整除他的數字");
            } else {
                System.out.println("整除");
            }
        }else if(num<2){
            System.out.println("輸入的數字不可以為負數,'1','0'");
        }else{
            System.out.println("請輸入正整數。");
        }
    }
}

