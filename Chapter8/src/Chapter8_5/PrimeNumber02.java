package Chapter8_5;

public class PrimeNumber02 extends Thread{
	int num;
	PrimeNumber02(int num, String name){
		setName(name); // �Է¹��� ���ڸ� �������� �̸����� ����
		this.num = num;
	}
	public void run() {
		boolean s = true;
		System.out.println(getName()+":");
		for(int i=2;i<=num;i++) { // 2���� num����
			for(int j=2;j<i;j++) { // 2���� i������ ���ڷ�
				if(i%j==0) { // ���������� ������ ��������
					s = false; // �Ҽ��� �ƴϴ�.
					break; // ���� ���ڷ� �Ѿ�� ���� �ٷ� ����
				}
			}
			if(s) { // true�̸� (=�Ҽ��̸�)
				System.out.print(i+"\t");
			}
			s = true;
		}
	}
	
}
