public class TernaryOperator078{
    public static void main(String[] args){
    //三元運算符：
    //條件表達式? 選項1:選項2
    //若為真，為選項1，若為假則為選項2

    int a=10;
    int b=99;
    int result=a>b?a++:b--;
    System.out.println("result="+result);//b=99
    //因為是後--，所以先返回b值，在--

    
    int c=10;
    int d=99;
    int x=c<d?c++:d--;
    System.out.println("x="+x);//x=10 
    System.out.println("c="+c);//c=11
    System.out.println("d="+d);//d=99(沒被執行)

    //三元運算符可以與 if--else-- 語句調換
    int q=3;
    int w=4;
    int res;
    if(q>w){
        res=q++;}
    else{
        res= --w;}
    System.out.println("res="+ res);


    //三個數比較，求出最大值
    int a1=553;
    int a2=22;
    int a3=123;

    int max1= a1>a2?a1:a2;
    int max2= max1>a3?max1:a3;
    System.out.println("max="+max2);




    }
}