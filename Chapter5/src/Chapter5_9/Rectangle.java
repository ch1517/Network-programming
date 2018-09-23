package Chapter5_9;

public class Rectangle {
	double width;
	double height;
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return this.width*this.height;
	}
	public double getCircumference() {
		return 2*(this.width+this.height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적 : "+rc.getArea());
		System.out.println("둘레 : "+rc.getCircumference());
	}

}
