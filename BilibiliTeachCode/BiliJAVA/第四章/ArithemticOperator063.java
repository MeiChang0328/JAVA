 public class ArithemticOperator063{
    public static void main(String[] args){
        //(一)算術運算符： + , - , * , / ,  '++'  ,  '--'
        
        //除法細節
        System.out.println(10/4);
        //為int值，所以輸出會是去了小數點=2
        System.out.println(10.0/4);
        //10.0默認為double,值為2.5
        double d=10/4;
        System.out.println(d);
        //先算10/4,值為2,再把2付給double,所以為2.0

        //(%)取模，取餘數
        //公式為a%b = a-(int)a/b*b
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1

        //++的使用
        int i=10;
        i++;
        System.out.println("i="+i);//11

        int a=10;
        a++;
        ++a;
        System.out.println("a="+a);//12,獨立使用的話前++、後++都相同

        /*
        作為表達式使用
        前++,先++後賦值
        後++，先賦值再++
        */
        int j=8;
        int k=++j;//相同於8先加1,再賦值給K
        System.out.println("k="+k+" J="+j);//9,9

        int q=8;
        int o=q++;//q先賦值給o，再自增1
        System.out.println("q="+q+" o="+o);//9,8


    }
 }