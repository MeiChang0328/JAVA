package BilibiliTeachCode.Ep71;

public class lazySingle {
	//私有化靜態便亮
	private static lazySingle b;

	//私有化構造器
	private lazySingle() {
	}

	//提供靜態變量返回對象，真正需要創建對象時才創建
	public static lazySingle getInstance(){
		if (b == null){
			b=new lazySingle();
		}
		return b;
	}
}
