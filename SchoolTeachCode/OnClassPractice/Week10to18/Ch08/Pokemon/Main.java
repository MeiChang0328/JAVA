package Week10to18.Ch08.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pika =new Pokemon("pika",100);
        pika.printPokemon();

        Pokemon bird=new Pokemon();
        bird.printPokemon();

        Pokemon duck=new Pokemon("kudaduck",100,20,35);
        duck.printPokemon();
    }
}
