package Week1to9.Ch01ToCh05;

import java.io.*;

public class MoviePrice {
    public static void main(String[] args)
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入想要購買的票卷");
        System.out.println("1.全票(300)，2.優待票(270)，3.早場票(240)");

        String str = br.readLine();
        int chose =Integer.parseInt(str);

        System.out.println("請輸入你需要該票種幾張票卷？");
        str= br.readLine();
        int num=Integer.parseInt(str);

        switch (chose){
            case 1:
                chose=300;
                break;
            case 2:
                chose=270;
                break;
            case 3:
                chose=240;
                break;
            default:
                System.out.println("您輸入錯誤票種，請輸入數字：'1','2','3'");
        }

        if (chose==300||chose==270||chose==240){
            int price=chose*num;
            System.out.println("你購買的票卷總金額為"+price+"元");
        }else {
            System.out.println("無法識別您的選擇");
        }


    }
}
