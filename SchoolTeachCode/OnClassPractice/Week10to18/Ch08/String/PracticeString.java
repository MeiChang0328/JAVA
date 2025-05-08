package Week10to18.Ch08.String;
import java.util.Scanner;

public class PracticeString {
	public static void main(String[] args) {

		//使用者輸入一個長度大於6的字串
		//若長度小於，請使用者重新輸入
		//輸入後字串處理如下
		//每一個字元轉小寫
		//接著進行下列編碼
		//"a"->"4"
		//"e"->"3"
		//"l"->"1"
		//"t"->"7"
		//"s"->"5"
		String str;
		Scanner sc=new Scanner(System.in);

		while (true) {
			str = sc.nextLine();
			if (str.length()>5){
				break;
			}
		}

		str=str.toLowerCase()
						.replace("a","4")
						.replace("e","3")
						.replace("l","1")
						.replace("t","7")
						.replace("s","5");
		System.out.println(str);


	}
}
