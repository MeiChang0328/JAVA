package Week10to18.Ch08.ObjectAddress;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        int num =5;

        MyPrinter printer=new MyPrinter();
        printer.printValue(num);
        System.out.println("Main num:"+num);


        IcCard mycard=new IcCard();
        mycard.number="D111";
        mycard.balance=100;
        mycard.printInfo();

        printer.printIcCard(mycard);
        mycard.printInfo();

        IcCard yourcard=new IcCard();
        yourcard.number="D222";
        yourcard.balance=1000;
        printer.printIcCard(yourcard);
        mycard.printInfo();


        yourcard=mycard;
        printer.printIcCard(mycard);
        yourcard.printInfo();



    }
}
