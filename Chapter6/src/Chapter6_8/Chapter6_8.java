package Chapter6_8;

public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3.4,4.5);
		Complex c2 = new Complex(5.2,-2.4);
		System.out.print("더한 결과 : ");
		Complex.add(c1,c2).print();
		System.out.print("뺀 결과 : ");
		Complex.sub(c1,c2).print();
		System.out.println("x의 절대값 : "+c1.abs());
		System.out.println("y의 절대값 : "+c2.abs());
	}

}
