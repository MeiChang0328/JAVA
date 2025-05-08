

package Week1to9.Ch06;
import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {

        int a[] ={1,2,3,4,5,};
        for (int e:a){
            System.out.println(e);
        }

        int sum,range;
        sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入您要的範圍，以利加總所有的奇數");
        range = sc.nextInt();

        for (int i =1;i<=range;i+=2){
            sum+=i;
        }
        System.out.println("到您指定的範圍，所有的奇數總和為"+sum);

    }
}
