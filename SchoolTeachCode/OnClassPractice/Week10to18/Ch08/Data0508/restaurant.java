package Week10to18.Ch08.Data0508;

public class restaurant {

	public void forLunch(Person p){
		System.out.println("welcome to FCU餐廳");
		p.eat();
	}
	public void fordormitory(Person p){
		System.out.println(p.getName()+" 回到FCU宿舍");
		p.sleep();
	}

}
