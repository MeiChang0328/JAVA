package BilibiliTeachCode.Ep73Enum;

public class main {

	public static void main(String[] args) {
		control(enum1.W);
		control(enum1.A);
		control(enum1.S);
		control(enum1.W);

	}

	public static void control(enum1 e){
		switch (e){
			case W:
				System.out.println("up");
				break;
			case A:
				System.out.println("left");
				break;

			case D:
				System.out.println("right");
				break;

			case S:
				System.out.println("down");
				break;

		}
	}
}
