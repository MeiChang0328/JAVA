package Week1to9.Ch07;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] a={20,30,40};
        int[] b=a;
        b[2]=100;
        System.out.print("陣列a的元素；");
        for (int i:a){
            System.out.print(i+"\t");
        }
        System.out.print("\n");
        System.out.print("陣列b的元素；");
        for (int i:b){
            System.out.print(i+"\t");
        }
    }
}
