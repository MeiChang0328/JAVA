package BilibiliTeachCode.Ep71;
//設計承單例設計模式
public class single {

	//定義一個靜態變量，用於基本本類的一個唯一對象
	private static single a=new single();

	//私有化構造器
	private single(){
	}

	//提供一個公開的靜態方法，返回這個類的唯一對象
	public static single getInstance(){
		return a;
	}
}

