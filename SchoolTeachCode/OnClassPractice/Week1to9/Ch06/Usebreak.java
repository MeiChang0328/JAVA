package Week1to9.Ch06;

public class Usebreak {
    public static void main(String[] args) {
        int i=1;
        while (i>0){
            System.out.println("無限迴圈執行中");
            if (i==5){
                break;
            }
            i++;

        }
        System.out.println("成功跳出迴圈了");
    }
}
