package BilibiliTeachCode.Ep59praticethird;

public class Main {
    public static void main(String[] args) {
        Movie[] mo=new Movie[4];
        mo[0]=new Movie(1,"米奇17號","羅伯·派汀森",2025);
        mo[1]=new Movie(2,"無痛先生","傑克·奎德",2025);
        mo[2]=new Movie(3,"命中註定那頭鵝","詹懷雲",2025);
        mo[3]=new Movie(4,"風之谷","西亞·李畢福",1984);

        Serve se=new Serve(mo);
        se.printAll();
    }
}
