package Chapter4_8;

public class Chapter4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{78,48,78,98},{99,92},{29,64,83},{34,78,92,56}};
		int sum=0;
		for(int tmp[] : arr) {
			for(int i : tmp) {
				System.out.print(i+" ");
				sum+=i;
			}
			System.out.println("\t Че : "+sum+", ЦђБе : "+(double)sum/tmp.length);
			sum=0;
		}
	}

}
