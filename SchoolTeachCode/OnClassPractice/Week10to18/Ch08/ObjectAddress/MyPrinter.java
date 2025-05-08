package Week10to18.Ch08.ObjectAddress;

public class MyPrinter {

    void printValue(int num){
        num+=10;
        System.out.println("printValue num:"+num);
    }

    void printIcCard(IcCard card){
        card.balance+=10;
        card.printInfo();

    }}
