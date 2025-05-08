package Week10to18.Ch08.Static.Operation;

public class Temperature {

//	c*9/5.0 +32
//  (f-32)*5/9

	void CtranferF(double c){
		System.out.println((c * 9 / 5.0 + 32));
	}

	void FtranferC(double f){
		System.out.println(((f - 32) * 5 / 9));
	}

	public static double cTof(double c){
		return  c*9/5.0 +32;
	}


	public static double fToc(double f){
		return  (f-32)*5/9;
	}
}
