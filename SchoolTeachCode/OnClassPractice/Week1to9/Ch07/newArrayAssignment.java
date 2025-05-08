package Week1to9.Ch07;

public class newArrayAssignment {
    public static void main(String[] args) {
        int[] a={20,30,40};
        int[] b=new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[2]=100;
        System.out.print("a陣列：");

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        System.out.print("b陣列：");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
