package Week10to18.Ch08.Data0508;

public class Main {
	public static void main(String[] args) {
		Person Tom=new Person("A1234567","Tom");
		Person May=new Person();
		Tom.eat();
		May.eat();//空值

		Student john=new Student("B1234567","John","D1234");
		//寫新的class
		john.goCourse();
		john.sleep();
		john.goParty();

		inheritSudents Ken= new inheritSudents("C1234567","Ken","D12345");
		//使用繼承的方式
		Ken.sleep();
    Ken.eat();
		Ken.goParty();//繼承寫新方法的時候，呼叫getName()取得父類的成員變量
		//或者在父類使用protected修飾成員變量，可以在子類直接使用父類的成員變量(name)
		//若父類的成員變量使用private修飾，在子類的存取可以直接撰寫this.getName，他會找不到去找父類的

		inheritSudents sandy=new MasterStudent("V12345678","sandy","a1234","asdfg");
		sandy.sleep();

		MasterStudent s  = (MasterStudent)sandy;
		s.doResearch();
		s.eat();

		restaurant r=new restaurant();
		r.forLunch(sandy);
		r.fordormitory(sandy);

	}
}
