package Chapter4_1;

public class Chpater4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0; // ���� ī���� ����
		int k=0; // ���� ���� ����
		// ���� ���� ������ ������ 10�� ��� ���� ��� ������ ���� ��� ���� ���ö����� ��� \n�ȴ�. 
		for(int i=1;i<=100;i++) {
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
				System.out.print(i+" ");
				count++;
				k=1;
			}
			if(count%10==0&&k==1) {
				System.out.println();
				k=0;
			}
		}
	}
}
