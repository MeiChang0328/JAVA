package Week1to9.Ch07;

public class ArrayAverge {
    public static void main(String[] args) {
        double[] score;//宣告陣列
        score=new double[5];//配置陣列

        score[0]=40;
        score[1]=70;
        score[2]=85;
        score[3]=100;
        score[4]=45;

        double sum = 0;

        for (int i=0;i<score.length;i++){
            sum+=score[i];
        }
        double Averge=sum/score.length;
        System.out.print("全班平均分數為"+Averge);

    }
}
