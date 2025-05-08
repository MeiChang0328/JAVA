package Week1to9.Ch06;
import java.io.*;

public class CountEven {
    public static void main(String[] args) throws IOException{

        int sum,range,i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入您需要加總的偶數最後範圍為多少？");
        String text = br.readLine();
        range = Integer.parseInt(text);

        sum=0;
        i=0;
        while (i<=range){
            sum+=i;
            i+=2;
        }
        System.out.println("您輸入的範圍，所有偶數的總合為："+sum);


    }
}
