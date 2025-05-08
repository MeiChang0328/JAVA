package BilibiliTeachCode.Ep75Abstract;

public class main {
	public static void main(String[] args) {
		AnimalAbstract a=new dog("dog",4);
		a.walk();
		a.nosie();

		AnimalAbstract b=new bird("bird",2);
		b.walk();
		b.nosie();
	}
}
//有使用抽象類只能用抽象修飾類別
//寫抽象類就是拿來當父類，專門給別人創造子類的
//在寫抽象方法時候不用把功能做出來，只要把名字寫出來，再用子類去重寫方法才能正常使用

