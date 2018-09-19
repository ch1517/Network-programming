package Chapter3_3;

import java.util.Scanner;

public class Chapter3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float kg = input.nextFloat();
		
		System.out.printf("%.3f",kg/0.453592); // *.# *:소수점 포함 총 자리 수, #: 소숫점 자리 수 
	}

}
