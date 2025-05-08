package Week10to18.Ch08.Static.Operation;

public class Pokemon {
	/*	成員變數如下
	Name,cp,hp,candy
	將所有成員變數修飾為private

	定義建構方法public
	沒有參數

	定義建構方法public
	讓呼叫者對所有成員變數指定初始值

	定義getter  setter 為public方法
	sp candt不可小於0
	否則為無效變更

	定義一個static printString方法*/

	private String name;
	private int cp;
	private int hp;
	private int candy;

	Pokemon(){
		cp=ranValue();
		hp=ranValue();
		candy=ranValue();
	}
	Pokemon(String name , int cp ,int hp,int candy){
		this.name=name;
		this.cp=cp;
		this.hp=hp;
		this.candy=candy;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setCp(int cp){
		if (cp>=0){
		this.cp=cp;
		}else {
			System.out.println("無效變更");
		}
	}
	public void setHp(int hp){
		if (hp>=0){
			this.hp=hp;
		}else {
			System.out.println("無效變更");
		}
	}
	public void setCandy(int candy){
		if (candy>=0){
			this.candy=candy;
		}else {
			System.out.println("無效變更");
		}
	}


	public String getName(){
		return name;
	}

	public int getCp(){
		return cp;
	}

	public int getHp(){
		return hp;
	}

	public int getCandy(){
		return candy;
	}


	static void printString(Pokemon p) {
		System.out.println("{name:" + p.getName() + ",cp:" + p.getCp() + ",hp:" + p.getHp() + ",candy:" + p.getCandy() + "}");
		//靜態方法不能取得物件的一般的成員變數
		//一般方法可以取得靜態變數;
		//靜態方法無法呼叫一般方法(因為有很多物件，不知道要呼叫誰)
	}

	//1~100
	int randomValue(){
		double ranValue=Math.random();
		ranValue=(ranValue*100)+1;
		int ranInt=(int)ranValue;
		return ranInt;
	}
	//產生50~100
	int ranValue(){
		double ranValue=Math.random();
		ranValue=(ranValue*51);
		int ranInt=(int)ranValue;//0~50
		ranInt+=50;
		return ranInt;
	}


}
