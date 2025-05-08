package Week10to18.Ch08.ObjectAddress;

public class arrayObjectNull {

    public static void main(String[] args) {
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        IcCard[] ourCards=new IcCard[3];
        for (int i = 0; i < ourCards.length; i++) {
            System.out.println(ourCards[i]);
        }//不會直接賦值

        for (int i = 0; i < ourCards.length; i++){
            ourCards[i]=new IcCard();
            ourCards[i].balance+=i*10;
            System.out.println(ourCards[i].balance);
        }
    }
}
