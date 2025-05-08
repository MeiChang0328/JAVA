package Week10to18.Ch08.Lotto;

public class Lotto {

	// 產生一個 1~49 的整數
	public static int generateNum() {
		double value = Math.random() * 49; // 0 ~ 48.999...
		int ranInt = (int)value + 1;       // 1 ~ 49
		return ranInt;
	}

	// 產生 6 個不重複的隨機整數（1~49）
	public static int[] generateNums() {
		boolean theSame;
		int[] lottoNums = new int[6];
		int count = 0;
		int ranValue;

		while (count < 6) {
			ranValue = generateNum();
			theSame = false;

			// 只比對已經產生的號碼，不要掃整個陣列
			for (int i = 0; i < count; i++) {
				if (ranValue == lottoNums[i]) {
					theSame = true;
					break;
				}
			}
			if (!theSame) {
				lottoNums[count] = ranValue;
				count++;
			}
		}
		return lottoNums;
	}
}
