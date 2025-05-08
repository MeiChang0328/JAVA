package Week10to18.Ch08;

public class Math {
	public static void main(String[] args) {
		/*ceil，無條件進位
		* floor，無條件捨去
		* round，四捨五入
		* abs，絕對值
		* max，找大值
		* min，回傳最小值
		* random，隨機回傳0~1之間的浮點數
		* */
		System.out.println(java.lang.Math.floor(5.8));
		System.out.println(java.lang.Math.round(5.5));
		System.out.println(java.lang.Math.abs(-10));
		System.out.println(java.lang.Math.ceil(5.8));
		System.out.println(java.lang.Math.random());
		System.out.println(java.lang.Math.max(5.8,9.7));
		System.out.println(java.lang.Math.min(3.2,0.7));

		//隨機產生1~10
		double ranValue= java.lang.Math.random();
		ranValue=ranValue*10;//0~9
		int intValue=(int)ranValue;
		intValue=intValue+1;//1~10
		System.out.println(intValue);


	}
}
