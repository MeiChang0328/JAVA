package BilibiliTeachCode.theOther;

/**
 * The Ep11 class demonstrates basic Java functionality,
 * including defining methods and calling them from the main method.
 * <p>
 * It contains a main method that prints a greeting message and calls another
 * method to perform additional tasks.
 */
public class Ep11 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        printHelloThree();
    }

    //再main裡面去調用自己設置的其他方法，不要把代碼coding main方法

    public static void printHelloThree() {
        System.out.println("hello!!!");
        System.out.println("hello!!!");
        System.out.println("hello!!!");
    }


    //求任意兩整數的和
    public static int add(int a, int b) {
        return a + b;
    }


}



