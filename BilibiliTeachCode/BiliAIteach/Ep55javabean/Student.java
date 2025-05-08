package BilibiliTeachCode.Ep55javabean;

public class Student {
    //私有成員變量
    private String name;
    private int math;
    private  int chinese;

    //建置有參無參構造器
    public Student(){
    }

    public Student(String name, int math, int chinese){
        this.name =name;
        this.math=math;
        this.chinese=chinese;
    }

    //建置setter,getter
    public void setName(String name){
        this.name=name;
    }

    public  void setMath(int x){
        this.math = math;

        if(x<=100 && x>=0){
            this.math = x;
        }

    }

    public void  setChinese(int chinese){
        this.chinese=chinese;
    }

    public int getMath(){
        return math;
    }

    public int getChinese(){
        return chinese;
    }

    public String getName(){
        return name;
    }
}
