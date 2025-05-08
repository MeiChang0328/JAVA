package BilibiliTeachCode.Ep69;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		GoldCard gc=new GoldCard("ABC-1234","小張","0936568086",5000);
		pay(gc);
		input(gc);

		SilverCard sc = new SilverCard("ADC-1224","小莊","0928305071",2000);
		pay(sc);
		input(sc);

	}

	public static void pay(Card c){
		System.out.println("請輸入您的消費金額");
		Scanner sc=new Scanner(System.in);
		double pay= sc.nextDouble();
		c.consum(pay);
	}

	public static void input(Card c){
		System.out.println("請輸入您的存入金額");
		Scanner sc=new Scanner(System.in);
		double money= sc.nextDouble();
		c.save(money);

	}
}
