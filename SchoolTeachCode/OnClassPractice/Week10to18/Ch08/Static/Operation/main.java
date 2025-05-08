package Week10to18.Ch08.Static.Operation;

public class main {
	public static void main(String[] args) {
		Pokemon pika=new Pokemon("pika",20,40,30);
		System.out.println(pika.getName());
		System.out.println(pika.getCp());
		System.out.println(pika.getHp());
		System.out.println(pika.getCandy());
		Pokemon.printString(pika);

		Pokemon duck=new Pokemon();
		duck.setCp(10);
		duck.setName("kuda");
		duck.setHp(100);
		duck.setCandy(20);
		Pokemon.printString(duck);

		Pokemon bird=new Pokemon();
		bird.setName("bird");
		Pokemon.printString(bird);

	}


}
