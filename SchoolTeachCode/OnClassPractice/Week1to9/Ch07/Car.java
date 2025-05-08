package Week1to9.Ch07;

public class Car {
    public static void main(String[] args) {
        int[] a={0,2,4,6};
        int[] b={20,30,40,50};

        int i =5;

        if (args.length>0){
        int c =Integer.parseInt(args[0]);
            if(c>0){
                i=c;
            }
        }

        int k=0;
        for (;k< a.length;k++){
            if (i<a[k]){
                System.out.println("你停車時數為"+i+"小時，落在停車區間為；"+a[k]+"~"+a[k-1]+"小時，採用累進費率計算停車費");
                break;
            }
        }
        k=k-1;

        int fee = 0;
        while (k>=0) {
            fee += (i-a[k])*b[k];
            i=i-(i-a[k]);
            k--;
        }

        System.out.print("您的停車總費用為"+fee);





    }
}
