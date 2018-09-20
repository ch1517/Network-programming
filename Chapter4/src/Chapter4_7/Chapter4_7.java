package Chapter4_7;

public class Chapter4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;
		while(true) {
			sum+=n;
			if(sum>5000){
				sum-=n;
				n-=1;
				break;
			}else {
				n++;
			}
		}
		System.out.println("n : "+n+", sum : "+sum);
	}

}
