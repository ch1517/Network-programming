package Chapter6_8;

public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3.4,4.5);
		Complex c2 = new Complex(5.2,-2.4);
		System.out.print("���� ��� : ");
		Complex.add(c1,c2).print();
		System.out.print("�� ��� : ");
		Complex.sub(c1,c2).print();
		System.out.println("x�� ���밪 : "+c1.abs());
		System.out.println("y�� ���밪 : "+c2.abs());
	}

}
