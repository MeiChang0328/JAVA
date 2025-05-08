package BilibiliTeachCode.Ep55javabean;

public class Ep55main {
    public static void main(String[] args) {
        Student s1 = new Student("小莊",70,100);

        Student s2=new Student();
        s2.setChinese(30);
        s2.setName("小眉");
        s2.setMath(100);

        Studentoperate s=new Studentoperate();
        s.caculateAerage(s1);
        s.caculateAllScore(s1);

        s.caculateAerage(s2);
        s.caculateAllScore(s2);


    }
}
