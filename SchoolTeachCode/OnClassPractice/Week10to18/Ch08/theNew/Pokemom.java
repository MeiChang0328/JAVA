package Week10to18.Ch08.theNew;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Pokemom {
    String name;
    int cp;
    int hp;
    int candy;
    int level;


     int powerUp(){
        candy-=5;
        cp+=20;
        int cp=50;
        System.out.println(cp);//優先使用區域變數
        System.out.println(this.cp);//使用this會優先使用成員變數


        int newCp=cp;
        return newCp;
    }

    int evolve(){
        candy-=20;
        cp+=50;
        level++;
//        System.out.println(newCp);
        return level;
    }

    int addCandy(int newCandy){
        candy+=newCandy;
        return candy;
    }

}
