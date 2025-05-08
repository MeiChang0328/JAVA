import java.util.Scanner;
public class e114ifElse05{
    public static void main(String[] args){
        Scanner myscanner=new Scanner(System.in);
        System.out.println("輸入月份");
        int month=myscanner.nextInt();
        
        if(month>=1&&month<=12){
            if(month>=4&&month<=10){
                System.out.println("請輸入年紀");
                int age=myscanner.nextInt();
                int ticket=60;
                if(age>=18&&age<=60){
                    System.out.println("你的票價為："+ticket);
                }else if(age<18){
                    System.out.println("你的票價為："+(ticket/2));
                }else if(age>=60){
                    System.out.println("你的票價為："+(ticket/3));
                }
            }else if(month<=3||month>=11){
                System.out.println("請輸入年紀");
                int age2=myscanner.nextInt();
                int ticket2=40;
                if(age2>=18&&age2<=60){
                    System.out.println("你的票價為："+ticket2);
                }else{
                    System.out.println("你的票價為："+(ticket2/2));
                }
            }
        }else{
            System.out.println("輸入錯誤");
        }

    }
}