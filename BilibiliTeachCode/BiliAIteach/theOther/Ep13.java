package BilibiliTeachCode.theOther;


public class Ep13 {
    public static void main(String[] args) {
        //認識變量
        //變量是一個內存中的存儲區域，可以存放數據，數據可以在同一個數據類型範圍內不斷變化
        //變量的定義格式：數據類型 變量名 = 變量值;
        //int a = 10;
        //使用變量的好處：提高代碼的重用性、維護姓，讓代碼更加靈活
        //變量有可被替換性，可以被其他數據替換
        primeVariable();
    }

    public static void primeVariable() {
        int age = 18;
        System.out.println(age);


        double price = 10.5;
        System.out.println(price);

        age = 20;
        System.out.println(age);
        age = age + 1;
        System.out.println(age);

        System.out.println("__________________");
        double money = 9.9;
        System.out.println(money);

        money = money - 5;
        System.out.println(money);

        money = money + 3;
        System.out.println(money);

    }
}


