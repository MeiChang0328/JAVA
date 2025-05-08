package BilibiliTeachCode.Ep59;
import java.util.Scanner;

public class movieOperation {
    private Moive[] movies;

    public movieOperation(Moive[] movies){
        this.movies=movies;
    }

    public void printAll() {
        for (int i=0;i<movies.length;i++){
            Moive m =movies[i];
            System.out.println("編號："+m.getId()+"，片名："+m.getName()+"，演員："+m.getActor());
        }
    }

    public void queryMovie() {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入電影ID序號以利查找");
        int x= sc.nextInt();
        for (int i =0;i<=movies.length;i++){
            if(x==i){
                Moive m=movies[i-1];
                System.out.println("編號："+m.getId()+"，片名："+m.getName()+"，演員："+m.getActor());

            }
        }
    }
}
