package Week1to9.Ch01ToCh05;

public class Parens {
    public static void main(String[] args) {
        int i = 1+3*5+7;
        System.out.println("1+3*5+7="+i);

        i=(1+3)*5+7;
        System.out.println("(1+3)*5+7="+i);

        i=1+3*(5+7);
        System.out.println("1+3*(5+7)="+i);

    }

}
