package Week10to18.Ch08.inherit0508;

public class circle {
	private double x,y;
	private double r;
	static final double pi =3.14;

	public circle(double x,double y,double r){
		this.x=x;
		this.y=y;
		this.r=r;

	}

	public circle(){}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}


	public void ceter(){
		System.out.println("圓心位置座標是： (" + x + "," + "y)");
	}

	public void area(){
		System.out.println("總面積為： " +(r*r*pi));
	}

}
