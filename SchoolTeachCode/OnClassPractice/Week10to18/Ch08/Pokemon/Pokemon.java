package Week10to18.Ch08.Pokemon;

import Week10to18.Ch08.theNew.Pokemom;

public class Pokemon {
    String name;
    int cp;
    int hp;
    int candy;
    Pokemon(){}
    Pokemon(String name, int cp,int hp, int candy){
        this.name=name;
        this.hp=hp;
        this.cp=cp;
        this.candy=candy;
    }
    Pokemon(String name, int candy){
        this.name=name;
        this.candy=candy;
        this.cp=20;
        this.hp=100;
    }

    void printPokemon(){
        System.out.println("name:'"+name+"';candy:"+candy+";cp:"+cp+";hp:"+hp);
    }


}
