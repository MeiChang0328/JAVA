package BilibiliTeachCode.Ep69;

public class Card {
	String carID;
	String name;
	String phoneNum;
	double money;

	public Card(){};
	public Card(String carID, String name, String phoneNum, double money) {
		this.carID = carID;
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
		this.carID = carID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double save(double money){
		this.money+=money;
		return money;
	}

	public double consum(double money){
		this.money-=money;
		return money;
	}
}
