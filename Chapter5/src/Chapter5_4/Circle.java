package Chapter5_4;

public class Circle {
	public double radius; // ���� ������
	public static double PI = 3.141592; // ������
	//������ ����
	public Circle(double radius) {
		this.radius=radius;
	}
	//���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�
	public double getArea() {
		return radius *radius*PI;
	}
}