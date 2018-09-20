package Chapter4_5;

public class Chapter4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1000000;
		for(int y=1;y<=10;y++) { // 1년에서 10년까지
			System.out.println(y+"년 후 : "+m*(1+0.045*y)+"원");
		}
	}

}
