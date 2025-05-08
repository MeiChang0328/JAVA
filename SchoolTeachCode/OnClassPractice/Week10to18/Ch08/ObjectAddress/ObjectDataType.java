package Week10to18.Ch08.ObjectAddress;

public class ObjectDataType {
    public static void main(String[] args) {
        IcCard myCard=new IcCard();
        myCard.number="D111";
        myCard.balance=100;
        myCard.printInfo();

        IcCard yourCard=new IcCard();
        yourCard.number="D222";
        yourCard.balance=300;
        yourCard.printInfo();

        System.out.println(myCard==yourCard);//比較儲存資料的記憶體位置(參照)

        yourCard=myCard;//yourCard的地址被改變了，改成跟myCard同一的地址(reference，儲存資料的記憶體位置)
        yourCard.printInfo();
        System.out.println(myCard==yourCard);



        yourCard.number="D333";//從myCard的地址去修改
        yourCard.balance=1000;
        myCard.printInfo();//yourCard改了之後也影響到myCard，所以兩個資料現在是一樣的
        yourCard.printInfo();
        System.out.println(myCard==yourCard);

        yourCard.pay(100);
        System.out.println(yourCard.booleanPay(1100));




    }
}
