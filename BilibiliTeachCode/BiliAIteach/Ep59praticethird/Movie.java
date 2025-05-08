package BilibiliTeachCode.Ep59praticethird;

public class Movie {
    private int id;
    private String Name;
    private String Actor;
    private int year;

    public Movie(){};
    public Movie(int id, String Name, String Actor, int year){
        this.id=id;
        this.Name=Name;
        this.Actor=Actor;
        this.year=year;
    }


    public void setId(int id){
        this.id=id;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public void setActor(String Actor){
        this.Actor=Actor;
    }
    public void setyear(int year){
        this.year=year;
    }
    public int getId(){
        return id;
    }
    public int getyear(){
        return year;
    }
    public String getName(){
        return Name;
    }
    public String getActor() {
        return Actor;
    }


}


