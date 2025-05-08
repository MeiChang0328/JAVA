package Week10to18.Ch08.theNew;

public class pika extends Pokemom{

    @Override
    int powerUp() {
        candy-=10;
        cp+=10;
        System.out.println(cp);//優先使用區域變數
        return candy;
    }
}
