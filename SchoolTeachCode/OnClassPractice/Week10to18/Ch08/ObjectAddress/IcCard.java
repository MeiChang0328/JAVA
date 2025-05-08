package Week10to18.Ch08.ObjectAddress;

public class IcCard {
    String number;
    int balance=0;

    int add(int money){
        balance =balance+money;
        return balance;
    }

    boolean booleanPay(int money){
        if(money>=0 && money<=balance){
            balance-=money;
            return true;
        }else {
            return false;
        }
    }

    int pay(int money){
        if(money>0){
            if(balance>money){
                System.out.println("付款成功");
                balance =balance-money;
                System.out.println("付款後餘額為："+balance);

            }else if(balance<money){
                System.out.println("付款失敗，餘額不足");
            }
        }else {
            System.out.println("付款商品不得為負值");
        }
        return balance;
    }




    void printInfo(){
        System.out.println("Card number:"+number+",balance:"+balance);
    }

}
