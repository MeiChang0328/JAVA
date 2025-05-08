package Week10to18.Ch08.constructor;

public class Car {
    String carNumber;
    String color;
    int doors;
    int seats;

    Car(){}


    Car(String carNumber,String color){
        this.carNumber=carNumber;
        this.color=color;
        doors=4;
        seats=5;
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

    void drive(){

    }

    void stop(){

    }

    void printCar(){
        System.out.println(carNumber+";"+color+","+doors+";"+seats);
    }
}
