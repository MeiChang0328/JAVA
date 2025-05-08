package Week1to9.Ch07;

public class MultiArrayForeach {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8}};

        for (int[] i:a){
            for (int j:i){
                System.out.print(j+"\t");
            }
        }
    }

}
