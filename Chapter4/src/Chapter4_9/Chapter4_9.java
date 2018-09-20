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
			if(i!=2&&i%2==0) { // 2가 아닌 2의 배수는 소수에서 제외
				prime[i]=0;
			}
			if(i!=3&&i%3==0) { // 3이 아닌 3의 배수는 소수에서 제외
				prime[i]=0;
			}
			if(i%Math.sqrt((double)i)==0) { // n이 n의 제곱근의 배수이면 소수에서 제외
				prime[i]=0;
			}
			if(prime[i]==1) {
				System.out.print(i+"\t");
				count++;
				if(count%20==0&&count!=0) { // count가 0이 아니고 20으로 나누어 떨어지면
					System.out.println();
				}
			}
		}
	}

}
