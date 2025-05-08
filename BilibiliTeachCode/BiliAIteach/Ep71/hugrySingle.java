package BilibiliTeachCode.Ep71;

public class hugrySingle {
	public static void main(String[] args) {
		System.out.println(single.getInstance());
		single a1=single.getInstance();
		System.out.println(a1);

		System.out.println("--------------------");
		lazySingle b1=lazySingle.getInstance();
		lazySingle b2=lazySingle.getInstance();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b2 == b1);


	}
}
