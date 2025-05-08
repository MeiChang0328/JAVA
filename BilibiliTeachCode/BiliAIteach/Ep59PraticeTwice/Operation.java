package BilibiliTeachCode.Ep59PraticeTwice;
import java.util.Scanner;
public class Operation {
    private Movie[] movies;
    public Operation(Movie[] movies){
        this.movies=movies;
    }
    public void printAll() {
        for (int i =0;i<movies.length;i++){
            System.out.println(movies[i].getID()+"\t"+movies[i].getName()+"\t"+movies[i].getActor()+"\t"+movies[i].getYear());
        }
    }

    public void queryTheOne() {
        System.out.print("請書輸入您要查尋之電影ID：");
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        for (int i =0;i<movies.length;i++){
            if(x==i){
            System.out.println(movies[i-1].getID()+"\t"+movies[i-1].getName()+"\t"+movies[i-1].getActor()+"\t"+movies[i-1].getYear());
            }
        }
    }
}
