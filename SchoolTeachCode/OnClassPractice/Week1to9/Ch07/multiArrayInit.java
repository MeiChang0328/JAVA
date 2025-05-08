package Week1to9.Ch07;

public class multiArrayInit {
    public static void main(String[] args) {
    int[][] a={{1,2,3,4},{5,6,7,8}};

    System.out.println("a陣列內共有"+a.length+"個元素");
    for (int i=0;i<a.length;i++){
        System.out.println("a["+i+"]內有"+a[i].length+"個元素");

        for (int j=0;j<a[i].length;j++){
            System.out.println("a["+i+"]["+j+"]"+"="+a[i][j]);
        }
    }
    }
}
