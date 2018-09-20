package Chapter4_10;

public class Chapter4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[10][]; // 파스칼 삼각형을 담을 배열
		int tmp1=1, tmp2=1; // tmp1는 분자, tmp2는 분모
		for(int n=0;n<10;n++) {
			arr[n] = new int[n+1]; // 행의 번호에 따라 레기드 배열 열 생성
			for(int r=0;r<=n;r++) { 
				for(int a=n;a>n-r;a--) {
					tmp1*=a; // 분자 n n-1 ... n-r+1
				}
				for(int b=r;b>=1;b--) { // 분모 r r-1 ... 1
					tmp2*=b;
				}
				arr[n][r]= tmp1/tmp2;
				System.out.print(arr[n][r]+" ");
				tmp1=1;tmp2=1; // 재사용을 위한 초기화
			}
			System.out.println();
		}
	}

}
