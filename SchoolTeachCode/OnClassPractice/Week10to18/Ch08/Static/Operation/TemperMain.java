package Week10to18.Ch08.Static.Operation;

public class TemperMain {
	public static void main(String[] args) {
		System.out.println(Temperature.cTof(100));
		System.out.println(Temperature.fToc(320));
		Temperature t=new Temperature();
		t.CtranferF(100);
		t.FtranferC(320);
	}
}
