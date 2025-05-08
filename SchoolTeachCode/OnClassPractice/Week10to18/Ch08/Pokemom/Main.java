package Week10to18.Ch08.Pokemom;

public class Main {
    public static void main(String[] args) {
        Pokemom pika=new Pokemom();
        pika.name="pika";
        pika.cp=50;
        pika.candy=100;
        pika.hp=10;
        pika.evolve();
        pika.printInfo();

        Pokemom duck=new Pokemom();
        duck.name="duck";
        duck.cp=150;
        duck.candy=10;
        duck.hp=200;
        duck.powerUp();
        duck.printInfo();
        duck.evolve();
        duck.printInfo();
        duck.powerUp();
        duck.printInfo();
    }
}
