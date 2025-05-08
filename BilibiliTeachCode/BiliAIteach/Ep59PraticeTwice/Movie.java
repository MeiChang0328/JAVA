package BilibiliTeachCode.Ep59PraticeTwice;

import java.time.Year;

public class Movie {
    private int ID;
    private String name;
    private String Actor;
    private int year;

    public Movie(int a,String b,String c,int d){
        this.ID=a;
        this.name=b;
        this.Actor=c;
        this.year=d;
    }

    public Movie(){}

    public void setID(int a){
        this.ID=a;
    }
    public void setName(String b){
        this.name=b;
    }
    public void setActor(String c){
        this.Actor=c;
    }
    public void setYear(int d){
        this.year=d;
    }

    public int getID(){
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getActor() {
        return Actor;
    }
    public int getYear() {
        return year;
    }


}
