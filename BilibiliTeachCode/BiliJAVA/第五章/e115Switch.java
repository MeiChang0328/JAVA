import java.util.Scanner;
public class e115Switch{
    public static void main(String[] args){
        /* stwich(值){
             case 常量1:
                語句塊1;
                break;
             case 常量2:
                語句塊2;
                break;
             default:
                default語句塊;
                break;
            } 
        
        如果與case1匹配，執行語句塊1
        如果與case1不匹配，繼續匹配case2
        如果都沒有匹配，執行default

        !!如果沒有寫break，會直接執行語句塊2，語句塊3，不會去匹配
        case常量2及3，直接穿透執行語句塊，連default都會執行
        */

       /* 
       1.該程式可以接收字符，比如abcdefg 
       2.a=星期一 b=星期二 ..
       3.根據客戶需求輸入顯示相關信息
       */
      Scanner myScanner=new Scanner(System.in);
      System.out.println("請輸入字母");
      char x = myScanner.next().charAt(0);
      switch(x){
        case 'a':
            System.out.println("星期一");
            break;
        case 'b':
            System.out.println("星期二");
            break;
        case 'c':
            System.out.println("星期三");
            break;
        case 'd':
            System.out.println("星期四");
            break;
        case 'e':
            System.out.println("星期五");
            break;
        case 'f':
            System.out.println("星期六");
            break;
        case 'g':
            System.out.println("星期日");
            break;
      }
    
    }
}