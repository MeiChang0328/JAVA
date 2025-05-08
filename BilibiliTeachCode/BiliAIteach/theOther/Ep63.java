package BilibiliTeachCode.theOther;

public class Ep63 {
    public static void main(String[] args) {
        zi02 zi = new zi02();
        zi.printAll();
    }
}

class fu02 {
    public void printAll() {
        System.out.println("hAAAAAAAAAAAAAAAA~");

    }
}

class zi02 extends fu02 {
    @Override//檢查重寫的方法
    public void printAll() {
        System.out.println("huuuuuuuuuuuuu~");

    }
}