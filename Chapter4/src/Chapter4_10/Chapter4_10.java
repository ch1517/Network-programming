package Chapter4_10;

public class Chapter4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[10][]; // �Ľ�Į �ﰢ���� ���� �迭
		int tmp1=1, tmp2=1; // tmp1�� ����, tmp2�� �и�
		for(int n=0;n<10;n++) {
			arr[n] = new int[n+1]; // ���� ��ȣ�� ���� ����� �迭 �� ����
			for(int r=0;r<=n;r++) { 
				for(int a=n;a>n-r;a--) {
					tmp1*=a; // ���� n n-1 ... n-r+1
				}
				for(int b=r;b>=1;b--) { // �и� r r-1 ... 1
					tmp2*=b;
				}
				arr[n][r]= tmp1/tmp2;
				System.out.print(arr[n][r]+" ");
				tmp1=1;tmp2=1; // ������ ���� �ʱ�ȭ
			}
			System.out.println();
		}
	}

}
