package Ch07.list;
import java.util.Scanner;
public class TheEndTest04 {
    public static void main(String[] args) {

        System.out.println("請輸入您想要輸入幾個數字為一個陣列：");
        Scanner sc=new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("只能輸入數字請重新輸入");
            sc.next();
        }
        int num = sc.nextInt();

        while (num<=0){
            System.out.println("請輸入大於0的數字已成立一個正確的陣列");
            num = sc.nextInt();
        }

        int[] numsArray=new int[num];
        System.out.println(numsArray.length);
        for (int i = 0; i < numsArray.length; i++) {
            System.out.println("您的"+numsArray.length+"個數的陣列，請輸入第"+(i+1)+"個數，以當作你陣列的第"+(i+1)+"個數");

            while (!sc.hasNextInt()){
                System.out.println("只能輸入數字請重新輸入");
                sc.next();
            }
            int x = sc.nextInt();
            numsArray[i]=x;
        }
        System.out.print("您輸入的原陣列值為：");
        for (int a:numsArray)
            System.out.print(a+" ");

        System.out.println();

        int x =numsArray.length;
        System.out.print("您輸入的原陣列值後反轉排列後為：");
        for (int i = (x-1); i >=0 ; --i) {
            System.out.print(numsArray[i]+" ");

        }
    }
}
