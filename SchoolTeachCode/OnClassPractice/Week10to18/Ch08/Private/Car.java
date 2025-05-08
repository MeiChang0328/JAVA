package Week10to18.Ch08.Private;

public class Car {
	//封裝，不可以從外部存取他
	private String carNumber;
	private String color;
	private int doors;
	private int seats;

	Car() {
	}


	Car(String carNumber, String color) {
		this.carNumber = carNumber;
		this.color = color;
		doors = 4;
		seats = 5;
	}

	Car(String carNumber, String color, int doors, int seats) {
		this.carNumber = carNumber;
		this.color = color;
		this.doors = doors;
		this.seats = seats;
	}

	//    Car(String carNumber,String color,int doors,int seats){
//        this.carNumber=carNumber;
//        this.color=color;
//        this.doors=doors;
//        this.seats=seats;
//    }


	//只能從特定方法取得及設定
	public void setCarNumber(String carNumber) {
		if (carNumber.length() == 8) {
			this.carNumber = carNumber;
		} else {
			System.out.println("Invalid car Number");
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(int doors) {
		if (doors > 0 && doors <= 5) {
		}
		this.doors = doors;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public int getSeats() {
		return seats;
	}

	void printCar() {
		System.out.println(carNumber + ";" + color + "," + doors + ";" + seats);
	}

	@Override
	public String toString() {
		return "Car{" +
						"carNumber='" + carNumber + '\'' +
						", color='" + color + '\'' +
						", doors=" + doors +
						", seats=" + seats +
						'}';
	}

	//static可以與所有物件共享
	static int caculate(int cp,int candy){
		return cp+candy;
	}
}
