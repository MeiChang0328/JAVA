package Week1to9.Ch06;

public class Count9x9 {
    public static void main(String[] args) {

        for (int i = 1;i<=9;i++){
//            System.out.print(i+"\n");
            System.out.printf("%n");

            for (int j = 2 ;j<=9;j++){
////                System.out.println(i+"/t");
////                System.out.print(j);
                System.out.print(j+"x"+i+"="+(i*j)+"\t");

            };
        }
    }
}
