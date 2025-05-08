public class RelationOperator069{
    public static void main(String[] args){

    //若開發中，代碼不可使用a.b
    //關係運算符
        int a=9;
        int b=8;
        //由關係運匴符組成的表達式，稱為關係表達式。舉例：a>b
        System.out.println(a>b);//T
        System.out.println(a<b);//F
        System.out.println(a>=b);//T
        System.out.println(a<=b);//F
        System.out.println(a==b);//F,"==":比較運算符
        System.out.println(a!=b);//T
        boolean flag=a>b;
        System.out.println("flag="+flag);


        }
    }