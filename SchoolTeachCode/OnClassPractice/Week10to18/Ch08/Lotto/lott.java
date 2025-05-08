package Week10to18.Ch08.Lotto;

public class lott {
	public static void main(String[] args) {
		//樂透，6個號碼，不能重複
		int[] lottoArray=new int[6];
		int count=0;
		int randomValue;
		boolean theSame;


		while (count<6){
			randomValue=Lotto.generateNum();
			theSame=false;
			for (int i = 0; i < lottoArray.length; i++) {
				if (randomValue==lottoArray[i]){
					theSame=true;
					break;
				}
			}
			if(theSame==false){
				lottoArray[count]=randomValue;
				count++;
			}
		}

		for (int a:lottoArray){
			System.out.println(a);
		}


	}
}