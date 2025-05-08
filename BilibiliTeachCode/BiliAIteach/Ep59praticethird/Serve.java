package BilibiliTeachCode.Ep59praticethird;

public class Serve {
    private Movie[] movies;
    public Serve(Movie[] movies){
        this.movies=movies;
    }
    public void  printAll(){
        for (int i =0;i<movies.length;i++){
            System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getActor()+"\t"+movies[i].getyear());
        }
    }

}
