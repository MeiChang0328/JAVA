package BilibiliTeachCode.Ep75Abstract;

public abstract class AnimalAbstract {

	private String animal;
	private int foots;

	public AnimalAbstract(int foots, String animal) {
		this.foots = foots;
		this.animal = animal;
	}

	public AnimalAbstract() {
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getFoots() {
		return foots;
	}

	public void setFoots(int foots) {
		this.foots = foots;
	}

	public abstract void nosie();
	public abstract void walk();
}
