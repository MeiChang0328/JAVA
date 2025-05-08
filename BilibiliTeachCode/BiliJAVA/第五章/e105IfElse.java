import java.util.Scanner;
public class e105IfElse{
    public static void main(String[] args){
        /* 
        (二)：分支控制(if--else)
        1.單分支
        2.雙分支
        3.多分支
        
        基本語法
        if(條件表達式[TRUE,FALSE])
            執行代碼塊
         */

        /* 編寫一個程序，可以輸入年齡，如果他年齡大於18，則輸出"大於18歲要執行懲戒"
        1.接收輸入的年齡，定義一個Scanner對象
        2.把年齡保存到int
        3.使用if判斷，輸出對應的訊息
        */

       System.out.println("請輸入年紀");
       Scanner Myscanner=new Scanner(System.in);
       int age = Myscanner.nextInt();
       if(age>=18){
        System.out.println("大於18歲要執行懲戒");
       }


    }
}