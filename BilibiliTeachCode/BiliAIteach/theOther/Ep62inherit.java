package BilibiliTeachCode.theOther;

public class Ep62inherit {
    public static void main(String[] args) {
        zi zi = new zi();
        zi.run();

    }
}

class fu {
    String name = "HAHA";
}

class zi extends fu {

    String name = "HEHE";

    public void run() {
        System.out.println(super.name);
        System.out.println(name);
        System.out.println(this.name);
    }

}