public class Operatorhomework101{
    public static void main(String[] args){
        System.out.println(10/3);//3
        System.out.println(10/5);//2
        System.out.println(-10.5%3);//-1.5
        /*a-(int)a/b*b=
        -10.5-{(-10)/3*3}
        =-10.5-(-9)
        =-1.5
        */

        int i=66;
        System.out.println(++i+i);//134
        /*
        i=i+1  >67
        i=67
        67+67=134
         */

        /*選出正確
        a.int a=(int)"18"   |錯誤，String>Iint  Interger.parseInt("18");
        b.int b=18.0        |錯誤，double沒辦法賦給int
        c.double c = 3d;    |正確
        d.double d = 8;     |正確，int>double
        e.int i=48;char ch=i+1;      |錯誤，int>char
        f.byte b = 19;short f = b+2  |錯誤，int>short
         */

        /*將String>double */
        String x="18.8";
        double y=Double.parseDouble(x);
        System.out.println(y);

        /*char>String*/
        char a='韓';
        String b=a+"";
        System.out.println(b);
        
    }
}