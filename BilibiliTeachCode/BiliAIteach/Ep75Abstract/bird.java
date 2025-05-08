package BilibiliTeachCode.Ep75Abstract;

public class bird extends AnimalAbstract{
	public bird() {
	}

	public bird(String animal,int foots) {
		super(foots, animal);
	}

	@Override
	public void nosie() {
		System.out.println(getAnimal()+" say:chuchuchu~~");

	}

	@Override
	public void walk() {
		System.out.println("用"+getFoots()+"隻腳行走");

	}
}
