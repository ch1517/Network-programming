package Chapter3_7;

import java.util.Scanner;

public class Chapter3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		if(month>=1&&month<=6) {
			System.out.println("상반기입니다.");
		} else if(month>=7&&month<=12) {
			System.out.println("하반기입니다.");
		} else {
			System.out.println("잘못된 숫자를 입력하였습니다.");
		}
	}

}
