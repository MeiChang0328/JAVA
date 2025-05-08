package BilibiliTeachCode.Ep59;

public class MoveMain {
    public static void main(String[] args) {
        BilibiliTeachCode.Ep59.Moive[] moives=new BilibiliTeachCode.Ep59.Moive[3];
        moives[0]=new BilibiliTeachCode.Ep59.Moive(1,"星際大戰","史迪奇");
        moives[1]=new BilibiliTeachCode.Ep59.Moive(2,"哈利波特","哈利波特");
        moives[2]=new BilibiliTeachCode.Ep59.Moive(3,"蜘蛛人","誰");

        movieOperation op=new movieOperation(moives);
        op.printAll();
        op.queryMovie();

    }
}
