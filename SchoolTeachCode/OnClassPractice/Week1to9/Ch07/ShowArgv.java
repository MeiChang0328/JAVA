package Week1to9.Ch07;

public class ShowArgv {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第"+i+"個參數："+args[i]);
        }
    }
}
