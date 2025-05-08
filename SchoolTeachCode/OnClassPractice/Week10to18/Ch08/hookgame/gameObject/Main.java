package Week10to18.Ch08.hookgame.gameObject;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
    int input, result;
    bucket bucket1=new bucket();//產生一個新的木桶物件
    Scanner scanner = new Scanner(System.in);//使用者輸入物件
    while (true) {
// 秀出沒有刀的洞
        for (int i = 0; i < bucket1.knifes.length - 1; i++)
            if (!bucket1.knifes[i])   System.out.print(i + ",");
        if (!bucket1.knifes[bucket1.knifes.length - 1])
            System.out.println(bucket1.knifes.length - 1);
        input = scanner.nextInt();// 取得user的下一刀的位置
        result=bucket1.put_knifes(input);
        if (result==1){
            System.out.println("成功");
            break;
        }else if(result==0){
            System.out.println("失敗");
        }else if (result==-1){
            System.out.println("爆, 失敗");
            break;
        }
    }
}

}



