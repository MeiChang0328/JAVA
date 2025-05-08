package BilibiliTeachCode.Ep59;

import javax.xml.namespace.QName;

public class Moive {
    private int id;
    private String name;
    private String actor;

    public Moive(int x,String y,String z){
        this.id=x;
        this.name=y;
        this.actor=z;
    }

    public Moive(){};


    public void setId(int x){
        this.id=x;
    }

    public void setName(String y){
        this.name=y;
    }

    public void setActor(String z){
        this.actor=z;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public String getActor() {
        return actor;
    }
}
