package BilibiliTeachCode.Ep69;

public class SilverCard extends Card{
	public SilverCard(String carID,String name,String phoneNum,double money){
		super(carID,name,phoneNum,money);
	}

	@Override
	public double consum(double money) {
		if (getMoney()>money){
			setMoney(getMoney()-money);
			System.out.println("你所剩餘額為：" + getMoney());
		}else {
			System.out.println("您卡內現有餘額為："+getMoney()+"，消費金額為："+money+"，餘額不足請存錢");
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
