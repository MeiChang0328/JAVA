package Week10to18.Ch08.constructor;

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
        Car suzuki=new Car("ASD-12345","red");
        suzuki.printCar();
    }
}
