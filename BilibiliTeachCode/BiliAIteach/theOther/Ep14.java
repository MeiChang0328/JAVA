package BilibiliTeachCode.theOther;

public class Ep14 {
    public static void main(String[] args) {
        //存儲數據基本原理
        //1Byte(字節)=8bit(字元)
        //1KB=1024Byte
        //1MB=1024KB
        //1GB=1024MB
        //1TB=1024GB
        //00000010(二進制,8位元)=2(十進制)
        //ASCII編碼表
        //(二進制)A=01000001,a=01100001
        //(十進制)A=65,a=97
        //(十六進制)A=41,a=61
        //十六進制:0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F

        char x ='A';//65
        System.out.println(x + 1);//66

        //圖片、視頻、音頻、文本、程序等都是以二進制存儲的
        //圖片每格像素點都是以(R,G,B)三個數字組成，每個數字都是0-255之間的數字
        //再將0~255之間的數字轉換為二進制存儲
    }
}
