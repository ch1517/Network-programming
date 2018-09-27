package Chapter8_6;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new PrimeNumber03(25),"소수 만드는 스레드").start(); // 두번째 인자 = 스레드 이름
	}

}
