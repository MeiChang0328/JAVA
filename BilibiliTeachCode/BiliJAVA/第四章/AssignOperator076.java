public class AssignOperator076{
    public static void main (String[] args){
        //賦值運算符：
        // +=  -=  /=  *=  %=
        //先算完再賦值，由右向左
        //賦值運算，會有強制類型資料轉換
        int n1=10;
        n1 += 4;//n1 = n1 + 4 ;
        System.out.println(n1);


        n1 /= 3;// n1 = n1 / 3
        System.out.println(n1);//4


        byte b = 3;
        b += 2 ;//b=(byte)(b+2)
        System.out.println(b);

    }
}