package Chapter5_3;

public class Cylinder {
	Circle c;
	double hight; // ����
	Cylinder(double radius,double hight){
		c = new Circle(radius);
		this.hight=hight;
	}
	public double getVolume() {
		return c.getArea()*hight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(2.8,5.6);
		System.out.println("���� : "+cylinder.getVolume());
	}

}
