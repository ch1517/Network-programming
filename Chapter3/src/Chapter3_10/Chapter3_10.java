package Chapter3_10;

import java.util.Scanner;

public class Chapter3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int money=input.nextInt();
		int tmp=money;
		int a,b,c,d; // 차례대로 50000, 10000, 5000, 1000 원 권 개수
		if(money>=1000) {
			a=tmp/50000;
			tmp%=50000;
			b=tmp/10000;
			tmp%=10000;
			c=tmp/5000;
			tmp%=5000;
			d=tmp/1000;
			System.out.println("50000원권 "+a+"개, 10000원권 "+b+"개, 5000원권 "+c+"개, 10000원권 "+d+"개");
		}else {
			System.out.println("최소 천 원 단위로 입력해주세요.");
		}
	}

}
