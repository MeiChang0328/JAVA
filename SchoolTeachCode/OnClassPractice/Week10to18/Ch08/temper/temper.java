package Week10to18.Ch08.temper;

public class temper {
    double hua;
    double she;
    double result;



    double  HuatoShe(){
        result=(hua-32)*5/9;
        return result;
    }
    double  ShetoHua(){
        result=(she*9)/5+32;
        return result;
    }
    void PrinthuatoSheTemper(){
        System.out.println("華氏溫度："+hua+"，轉換為攝氏溫度為："+result);
    }
    void PrintShetohuaTemper(){
        System.out.println("攝氏溫度："+she+"，轉換為華氏溫度為："+result);

    }
}
