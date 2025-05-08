package BilibiliTeachCode.Ep50Object;

public class Ep50main {
    public static void main(String[] args) {
        Ep50ObjectClass s1 =new Ep50ObjectClass();
        s1.name="波妞";
        s1.math=100;
        s1.chineses=100;

        Ep50ObjectClass s2 = new Ep50ObjectClass();
        s2.name="小莊";
        s2.math=30;
        s2.chineses=100;

        s1.printscore();
        s2.printscore();

    }
}
