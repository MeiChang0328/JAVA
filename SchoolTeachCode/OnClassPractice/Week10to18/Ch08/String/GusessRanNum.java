package Week10to18.Ch08.String;
import java.util.Scanner;

public class GusessRanNum {
	public static void main(String[] args) {
		//開發終極密碼的遊戲
		//隨機產生1~100的數字，讓使用者猜
		//當使用者猜整數後
		//若沒有猜中，必須告知使用者密碼介於甚麼之間


		double ranValue1=Math.random()*100;
		int ranValue=(int)ranValue1+1;



		int GNum;
		int mini=0;
		int max=100;
		System.out.println(ranValue);
		System.out.println("請猜一個數字介於"+mini+"~"+max+"之間");


		while (true){
			Scanner sc=new Scanner(System.in);
			GNum=sc.nextInt();

			if (ranValue==GNum){
				System.out.println("你猜中了");
				break;
			}else if(ranValue>GNum){
				mini=GNum;
				System.out.println("你猜的數字介於" + mini + "~" + max+"之間");
				continue;

			}else if(ranValue<GNum){
				max=GNum;
				System.out.println("你猜的數字介於" + mini + "~" + max+"之間");
				continue;
			}

		}

	}
}
