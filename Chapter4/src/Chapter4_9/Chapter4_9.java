package Chapter4_9;

public class Chapter4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime[]= new int[1001];
		prime[0]=0;
		prime[1]=0;
		int count=0;
		for(int i=2;i<=1000;i++) {
			prime[i]=1;
			if(i!=2&&i%2==0) { // 2�� �ƴ� 2�� ����� �Ҽ����� ����
				prime[i]=0;
			}
			if(i!=3&&i%3==0) { // 3�� �ƴ� 3�� ����� �Ҽ����� ����
				prime[i]=0;
			}
			if(i%Math.sqrt((double)i)==0) { // n�� n�� �������� ����̸� �Ҽ����� ����
				prime[i]=0;
			}
			if(prime[i]==1) {
				System.out.print(i+"\t");
				count++;
				if(count%20==0&&count!=0) { // count�� 0�� �ƴϰ� 20���� ������ ��������
					System.out.println();
				}
			}
		}
	}

}
