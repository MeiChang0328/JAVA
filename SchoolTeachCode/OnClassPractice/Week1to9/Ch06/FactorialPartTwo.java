package Week1to9.Ch06;
import java.io.*;
import java.util.Enumeration;

public class FactorialPartTwo {
    public static void main(String[] args) throws IOException {

        double sum;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入1-170之間的數字，計算乘階");



        while (true){
            String text = br.readLine();
            int num=Integer.parseInt(text);

            if(num==0){
                System.out.println("不可輸入0");
                break;
            }else if (num>170){
                System.out.println("輸入數值不可大於170");
                continue;
            }
            int range=num;

            for (sum=1;num>1;num--){
                sum *=num;
            }
            System.out.println(range+"!的科學記號為" + sum);
            break;
        }

    }
}
