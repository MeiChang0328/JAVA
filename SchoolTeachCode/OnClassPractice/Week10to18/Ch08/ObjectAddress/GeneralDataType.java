package Week10to18.Ch08.ObjectAddress;

public class GeneralDataType {
    public static void main(String[] args) {
        int a=10;
        int b=15;

        System.out.println("a:"+a+",b:"+b);

        b=a;
        System.out.println("a:"+a+",b:"+b);
        //只複製了值，並不是改了地址位置
        //與class不太一樣


        b=25;
        System.out.println("a:"+a+",b:"+b);

    }
}
