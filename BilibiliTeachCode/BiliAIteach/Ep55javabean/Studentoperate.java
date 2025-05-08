package BilibiliTeachCode.Ep55javabean;

public class Studentoperate {
    private Student s;

    public void caculateAllScore(Student s){
      System.out.println(s.getName()+"的總成績，數學為："+s.getMath()+"分，語文分數為"+s.getChinese()+"分。"
              );
    }
    public void caculateAerage(Student s){
        System.out.println(s.getName()+"的平均成績為為："+(s.getMath()+s.getChinese())/2+"分。");
    }
}
