public class InterverseOperator073{
    public static void main(String[] args){
        //邏輯運算符:取反與邏輯異或
        //取反"!"
        System.out.println(60>20);   //T
        System.out.println(!(60>20));//F
    

        //"^"(邏輯異或) : 兩邊結果不同為真，兩邊結果相同為假
        boolean b= (60>20)^(3<5);
        System.out.println("b="+b);
        }
}