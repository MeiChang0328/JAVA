package ilearnCheckList;
import java.util.Scanner;

public class The8th {
    public static void main(String[] args) {
//        炎炎夏日，台中天氣熱到整個不要不要，在這時快要渴死的你在全聯看到店員正貼著這樣的宣傳單: "三瓶空的可口可樂瓶可以換一瓶可樂"
//        現在你決定在便利商店買一些可樂(就說N瓶好了), 你想知道你最多可以喝到多少瓶 下面的hint說明 當 N=8 時候的情況.
//        方法一是標準的做法:在你喝了 8 瓶可樂之後, 你有 8 個空罐子, 把其中 6 瓶空罐子換成 2 瓶新的, 喝完之後你
//        就有 4 瓶空罐子, 然後你又可以拿 3 瓶換 1 瓶新的, 最後, 你只有 2 個空罐子, 所以你再也不能再換新的可樂了.
//        所以你總共可以喝到 8 + 2 + 1 = 11 瓶可樂.可是其實你有一個更好的方法!
//        在第二種方法裡面, 你可以先和你的朋友(或者是店員??)借一個空罐子, 然後你就可以喝到 8 + 3 + 1 = 12 瓶可樂!
//        當然, 你最後要把 1 瓶空罐子還給你的朋友.
        Scanner sc= new Scanner(System.in);
//        while (true) {
//            int a = sc.nextInt();
//            a++;
//            int b = a / 3;
//            int c = a % 3;
//            int f = b /3;
//            int g= b%3;
//            int d = (f + g + c) / 3;
//            int e = a + f + b + d - 1;
//            System.out.println(e);
//
//        }
        while (true){
            int a = sc.nextInt();
            a++;
            int sum=a;
            int x= 0;
            int f=0;
            for (int i = 0; i < 10; i++) {

                int c =a%3;
                x+= c;
                int b =a/3;
                int d= x/3;

                if(x>3){
                    f=0;
                    int e= x%3;
                    if (b+d+e==3){
                        f =(d+b+e)/3;

                    }
                    x=0;
                }
                sum=sum+b+d+f;

                if (b>=3 ){
                    a=b;
                }else if(b<3){
                    a=0;
                    f=0;
                }
            }
            System.out.println(sum-1);







        }



    }
}
