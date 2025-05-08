package Week1to9.Ch06;

public class UseOutLoop {
    public static void main(String[] args) {


        runloop:for (int x=1;x<=9;x++){
            for(int y =1;y<=9;y++){
                if((x*y)>25){
                    System.out.println(x+"x"+y+"="+(x*y));
                    break runloop;
                    //如果沒有runloop，就會每次執行有滿足條件break一次內迴圈，外迴圈會繼續執行
                    //若寫了runloop，只要內圈滿足條件，就可以終止迴圈，直接外迴圈也可以被終止
                }
            }
        }

    }
}
