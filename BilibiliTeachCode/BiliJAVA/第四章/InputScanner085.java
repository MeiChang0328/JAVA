import java.util.Scanner;// java.util(包)導入 Scanner(類)
    public class InputScanner085{
        public static void main(String[] args){
            /*
            演示用戶用戶輸入
            Scanner類表示簡單文本掃描器，在java.util包內
            步驟：
            1.引入/導入Scanner所在的包
            2.創建Scanner對象，new代表創建一個對像
              MyScanner即為創建的對象
            */
           Scanner MyScanner=new Scanner(System.in);
           /*
           3.接收用戶的輸入*/
           System.out.println("請輸入名字");
           String name=MyScanner.next();
        
           System.out.println("請輸入學號");
           int stunum=MyScanner.nextInt();

           System.out.println("學生名稱為"+name+"所對應的學號是"+stunum);

        }
    }