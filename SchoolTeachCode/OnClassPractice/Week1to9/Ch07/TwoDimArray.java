package Week1to9.Ch07;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a;
        a=new int[3][4];
        System.out.println("a陣列內共有"+a.length+"個元素");
        for (int i=0;i< a.length;i++){
            System.out.println("a["+i+"]內有"+a[i].length+"個元素");
        }
    }
}
