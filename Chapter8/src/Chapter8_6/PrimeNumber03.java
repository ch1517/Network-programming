package Chapter8_6;

public class PrimeNumber03 implements Runnable{
	int num; // ���ڸ� ������ ����
	PrimeNumber03(int num){
		this.num=num;
	}
	public void run() {
		boolean s = true;
		System.out.println(Thread.currentThread().getName()+":"); // ���� �������� �̸� ���
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
