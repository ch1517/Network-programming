package Chapter8_4;

public class PrimeNumber01 extends Thread {
	int num; // ���ڸ� ������ ����
	PrimeNumber01(int num){
		this.num=num;
	}
	public void run() {
		boolean s = true;
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
