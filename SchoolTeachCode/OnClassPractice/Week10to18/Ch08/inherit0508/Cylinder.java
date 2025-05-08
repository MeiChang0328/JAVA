package Week10to18.Ch08.inherit0508;

public class Cylinder extends circle{
	private double h;

	public Cylinder(){
		super();
	}

	public Cylinder(double x,double y,double r,double h){
		super(x,y,r);//一定要先對父類初始化!!!
		this.h=h;
	}

	@Override
	public void area() {
		System.out.println("總體積為" + (getR() * getR() * pi * h));
	}
}
