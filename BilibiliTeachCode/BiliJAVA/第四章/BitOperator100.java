public class BitOperator100{
    public static void main(String[] args){
        /*
        位運算：
        1.>>(算術右移)：低位溢出，符號位不變，並用符號位補益出的高位      
        2.<<(算術左移)：符號位不變，低位補0
        3.>>>(無符號右移)：低位溢出，高位補0
        (沒有 無符號左移<<<)
         */
        System.out.println(1>>2);
        System.out.println(1<<2);
        /*
        1>>2= 00000001 >> 00000000,01(溢出丟掉) = 1/2/2 = 0
        1<<2= 00000001 << 00,00000100          = 1*2*2 = 4
         */
        System.out.println(4<<3);
        //=4*2的3次方
        System.out.println(15>>2);
        //15*2的2次方 =3
    }
}