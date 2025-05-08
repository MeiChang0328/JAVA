package Ch07.list;

public class TheEndTest10 {
    public static void main(String[] args) {
        int[] x={10,1,22,23,4,5,7,45,8,9};
        for (int i = 0; i < x.length; i++) {
            if (i==x[i]){
                System.out.println("第"+i+"索引碼，與其該元素值相等");
            }
        }
    }
}
