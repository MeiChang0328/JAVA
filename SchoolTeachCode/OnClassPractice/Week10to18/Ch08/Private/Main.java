package Week10to18.Ch08.Private;

public class Main {
	public static void main(String[] args) {
//        Car toyota = new Car();
//        System.out.println(toyota.carNumber);
//        System.out.println(toyota.doors);
//        toyota.printCar();
//
//
//        Car bmw=new Car();
//        bmw.carNumber="BBB-1234";
//        bmw.color="black";
//        bmw.doors=2;
//        bmw.seats=2;
//        bmw.printCar();
		Car suzuki = new Car("ASD-1234", "red");
		suzuki.printCar();
		suzuki.setDoors(8);
		System.out.println(suzuki.getDoors());
		suzuki.setCarNumber("AAA-1111");
		System.out.println(suzuki.getCarNumber());
		suzuki.printCar();

		System.out.println(suzuki.toString());

		System.out.println(Car.caculate(10, 30));
		//直接從類別取得static方法，不需再new一個物件在取得，因為是static
	}



}
