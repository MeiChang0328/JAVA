package BilibiliTeachCode.Ep54capsulation;

public class Ep54class {

    String name;
    private int score;

    public void setScore( int x){
        if(x<=100 && x>=0){
            this.score =x;
        }else {
            System.out.println("輸入的成績分數異常，請重新檢查");
        }
    }

    public int getScore(){
        return score;
    }

    public void printScoreList(){
        this.name=name;
        System.out.println(name+"的成績是"+score);
    }
}
