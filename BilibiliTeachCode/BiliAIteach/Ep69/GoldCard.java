package BilibiliTeachCode.Ep69;

public class GoldCard extends Card{
	public GoldCard(String carID, String name, String phoneNum, double money) {
		super(carID, name, phoneNum, money);
	}

	@Override
	public double consum(double money) {
		System.out.println("你消費的金額是：" + money+"，折扣後的消費金額是：" + money * 0.8);
		if (getMoney()>money*0.8){
			setMoney(getMoney()-money*0.8);
			System.out.println("你所剩餘額為：" + getMoney());
			System.out.println("金卡提供洗車票卷");
		}else {
			System.out.println("您卡內現有餘額為："+getMoney()+"，消費金額為："+money*0.8+"，餘額不足請存錢");
		}
		return this.money;
	}

	@Override
	public double save(double money) {
		System.out.println("您存入金額為：" + money);
		setMoney(getMoney()+money);
		System.out.println("現卡內存入總餘額為：" + getMoney());
		return this.money;
	}
}
