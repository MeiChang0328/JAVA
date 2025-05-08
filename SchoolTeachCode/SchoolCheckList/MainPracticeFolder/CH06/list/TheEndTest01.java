package CH06.list;

public class TheEndTest01 {
    public static void main(String[] args) {
        int sum=0 ;
        for (int i=0;i<=100;i+=3){
            sum+=i;
        }
        System.out.println("1~100所有為3的倍數為:"+sum);
    }
}
