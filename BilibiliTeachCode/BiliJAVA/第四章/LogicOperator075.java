public class LogicOperator075{
    public static void main(String[] args){
        //邏輯運算練習題
        //試想結果?

        boolean x=true;
        boolean y=false;
        short z=46;
        if((z++==46)&&(y=true)) z++;
        // True       True----->再++
        //先比較再自增  false->True
        //  47                  48

        if((x=false)||(++z==49)) z++;
        //True->False  先自增再比較
        //  false      49=49    49+1=50

        System.out.println("z="+z);
    }
}