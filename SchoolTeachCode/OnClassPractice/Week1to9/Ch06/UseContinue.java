package Week1to9.Ch06;
import java.io.*;

public class UseContinue {
    public static void main(String[] args) throws IOException {
        int range, sum;
        sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入你要加總的偶數的最後範圍");
        String text = br.readLine();
        range = Integer.parseInt(text);

        for (int i = 0; i <= range; i++) {
            if(i%2==0){
                continue;
            }
            sum+=i;
        }
        System.out.println("您所輸入至" + range + "的所有偶數總和為" + sum);
    }
}
