package Chapter5_4;

public class Cylinder {
	Circle c;
	double hight; // ����
	Cylinder(Circle c,double hight){
		this.c = c;
		this.hight=hight;
	}
	public double getVolume() {
		return c.getArea()*hight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(new Circle(2.8),5.6);
		System.out.println("���� : "+cylinder.getVolume());
	}

}
