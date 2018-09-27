package Chapter8_5;

public class PrimeNumber02 extends Thread{
	int num;
	PrimeNumber02(int num, String name){
		setName(name); // 입력받은 인자를 스레드의 이름으로 지정
		this.num = num;
	}
	public void run() {
		boolean s = true;
		System.out.println(getName()+":");
		for(int i=2;i<=num;i++) { // 2부터 num까지
			for(int j=2;j<i;j++) { // 2부터 i까지의 숫자로
				if(i%j==0) { // 나누었을때 나누어 떨어지면
					s = false; // 소수가 아니다.
					break; // 다음 숫자로 넘어가기 위해 바로 정지
				}
			}
			if(s) { // true이면 (=소수이면)
				System.out.print(i+"\t");
			}
			s = true;
		}
	}
	
}
