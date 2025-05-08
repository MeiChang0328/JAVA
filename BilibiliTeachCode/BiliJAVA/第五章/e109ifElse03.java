import java.util.Scanner;
public class e109ifElse03{
    public static void main(String[] args){
        /* 
        (二)：分支控制(if--else)
        1.單分支
        2.雙分支
        3.多分支
        
        基本語法
        if(條件表達式[TRUE,FALSE]){}
            執行代碼塊1
        }else if(條件表達式){
            執行代碼塊2
        }else{
            執行代碼塊3
        }

        當條件表達式1成立執行代碼塊1
        若條件表達式1不成立，去判斷條件表達式2是否成立
        若條件表達式2成立執行代碼塊2
        若所有條件表達式都不成立，只能執行else的代碼塊

        若所以條件表達式都沒有成立，也沒有else的入口執行，則所有代碼塊都不反應
         */

        /* 輸入信用分數
        1.100分>信用極好
        2.80-99>信用優秀
        3.60-80>信用一般
        4.其他信用不及格

        要先對分數進行有效無效判斷(1-100)
        */

       System.out.println("請輸入信用分數");
       Scanner myScanner=new Scanner(System.in);
       int score = myScanner.nextInt();
       if(score>=1&&score<=100){
                if(score==100){
                System.out.println("信用極好");
            }else if(score>80&&score<=99){
                System.out.println("信用優秀");
            }else if(score>=60&&score<=80){
                System.out.println("信用一般");
            }else{
                System.out.println("信用不及格");
            }
       }else{
                System.out.println("請重新輸入分數");
       }
    }
}