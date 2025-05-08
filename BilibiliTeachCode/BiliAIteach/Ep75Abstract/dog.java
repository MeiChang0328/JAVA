package BilibiliTeachCode.Ep75Abstract;

public class dog  extends AnimalAbstract{
	public dog( String animal,int foots) {
		super(foots, animal);
	}

	public dog() {
	}

	@Override
	public void nosie() {
		System.out.println(getAnimal()+" say:wa!");
	}

	@Override
	public void walk() {
		System.out.println("用"+getFoots()+"隻腳行走");
	}
}
