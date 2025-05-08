package Week1to9.Ch07;

public class ArrayLoop {
    public static void main(String[] args) {
        double[] score={20,60,55,100,74};//宣告並直接指派內容
        double sum = 0;

        for(double i:score){
            sum+=i;
        }
        double Averge=sum/score.length;
        System.out.print("全班平均分數為"+Averge);
    }
}
