package BilibiliTeachCode.Ep50Object;

public class Ep50ObjectClass {
    String name;
    int math;
    int chineses;

    public void printscore(){

        System.out.println(name+"的數學分數為："+math+"，國文分數為："+chineses);
        System.out.println("平均成績為" +
                (math+chineses)/2);
    }

}

