import java.util.Scanner;
public class e113ifElse04{
    public static void main(String[] args){
        /* 成績大於8.0進入決賽，否則提示淘汰，並根據性別提示
        進入南子組或女子組 */
        
        Scanner myscanner=new Scanner(System.in);
        System.out.println("請輸入分數");
        double score = myscanner.nextInt();
        
        if(score>=8.0){
            System.out.println("請輸入性別");
            char gender=myscanner.next().charAt(0);
            if( gender == 'M' ){
                System.out.println("男子組");
            }else if(gender == 'W' ){
                System.out.println("女子組");
            }else{
                System.out.println("輸入錯誤");
            }
        }else{
            System.out.println("淘汰");
        }
    }
}