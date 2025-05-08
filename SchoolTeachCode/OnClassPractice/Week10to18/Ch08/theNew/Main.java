package Week10to18.Ch08.theNew;

public class Main {
    public static void main(String[] args) {
        Pokemom pika = new Pokemom();
        pika.powerUp();//區辨區域變數、跟成員變數的優先級使用


//        int j=0;
//        int i=0;
//        for (i=0;i<5;i++){
//            j=i+1;
//            System.out.println(i + ";" + j);
//        }
//        System.out.println(i + ";" + j);


        for (int h = 0; h < 5; h++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(h + ";" + k);
            }
//            System.out.println(h + ";" + k);//無法使用k
        }

        Pokemom[] numbers = new Pokemom[3];

        for (int p = 0; p < numbers.length; p++) {
            numbers[p] = new Pokemom();
            numbers[p].cp += p * 10;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i].cp);
        }

        Pokemom[] pokemom2 = {new Pokemom(), new Pokemom()};


        PokemonPark park = new PokemonPark();
        park.countPokemons(numbers);
        park.countPokemons(pokemom2);
        park.countPokemons(new Pokemom[]{new Pokemom()});//=new pokemon[1]
        Pokemom p=new pika();
        p.powerUp();
        p.powerUp();

    }
}

