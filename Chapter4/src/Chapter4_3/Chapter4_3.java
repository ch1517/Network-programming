package Chapter4_3;

import java.util.Scanner;

public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		do {
			System.out.print(n%10); // 일의 자리 출력
			n/=10; // 일의 자리 숫자를 제외하고 새로운 수를 담음
		} while(n!=0);
			
	}

}
