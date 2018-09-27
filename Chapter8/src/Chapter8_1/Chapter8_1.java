package Chapter8_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0,z=0;
		Scanner input = new Scanner(System.in);
		System.out.print("정수 두 개 입력 : ");
		try {
			x = input.nextInt();
			y = input.nextInt();
			z =x*y;
			System.out.printf("%d * %d = %d %n",x,y,z);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}
