package Week10to18.Ch08.Pokemom;

public class Pokemom {
    String name;
    int cp;
    int hp;
    int candy;

    void powerUp(){
        if (candy>=5){
            candy-=5;//candy=candy-5;
            cp+=10;//cp=cp+10;

        }else if (candy<5){
            System.out.println("升級失敗，candy值不足");
        }
    }

    void evolve(){
        if (candy>=15){
            candy=candy-15;
            cp=cp+50;

        }else if (candy<15){
            System.out.println("進化失敗，candy值不足");
        }

    }

    void printInfo(){
        String info="Pokemom{"+
                "name='"+name+'\''+
                ",cp="+cp+
                ",hp="+hp+
                ",candy="+candy+'}';
        System.out.println(info);
    }
}
