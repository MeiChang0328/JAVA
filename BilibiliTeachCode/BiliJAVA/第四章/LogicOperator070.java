public class LogicOperator070{
    public static void main(String[] args){
        //邏輯運算符
        //:  "&&"(短路與)   "||"(短路或)   "!"(取反)
        //：  "&"(邏輯與)   "|"(邏輯或)    "^"(邏輯異或)

        //"&&"短路與
        int age=50;
        if( age>20 && age<90){
            System.out.println("ok100");
        }
        //"&"邏輯與
       if( age>20 & age<90){
            System.out.println("ok100");
        }
    
       

        //差異
        //"&&"
        int a=4;
        int b=9;
        if( a<1 && ++b< 50){ //F
            System.out.println("ok300");
        }
        System.out.println("a="+a+" B="+b);
        //a=4,b=9,因為短路與若前面已經為錯誤就"不會繼續執行"後面的計算

        //"&"
        int c=4;
        int d=9;
        if( c<1 & ++d< 50){ //F
            System.out.println("ok400");
        }
        System.out.println("c="+c+" d="+d);
        //c=4,d=10,因為短路與若前面已經為錯誤"仍然"會繼續執行後面的計算

        //"&&"短路與在開發中使用頻率較高，因計算效率較高
    }
}