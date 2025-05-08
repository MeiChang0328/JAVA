package Week1to9.Ch07;

public class DeclareAndInt {
    public static void main(String[] args) {
        double[] score={20,50,55,100,74};//宣告並直接指派內容
        double sum = 0;
        for (int i =0;i<score.length;i++){
            sum+=score[i];
        }
        double Average = sum/score.length;
        System.out.print("全班平均分數為"+Average);

    }
}
