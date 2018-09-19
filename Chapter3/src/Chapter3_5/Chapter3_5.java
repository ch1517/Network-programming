package Chapter3_5;

import java.util.Scanner;

public class Chapter3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		char c; // 윤년이면 a, 평년이면 b
		if(year%4==0) { // 4로 나누어 떨어지는 해는 윤년
			if(year%100==0) { // 이 중에 100으로 나누어 떨어지는 해는 평년
				if(year%400==0) { // 이 중에 400으로 나누어 떨어지는 해는 윤년
					c='a';
				}
				else {
					c='b';
				}
			} else {
				c='a';
			}
		} else {
			c='b';
		}
		
		if(c=='a') {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}

}
