package Chapter3_8;

import java.util.Scanner;

public class Chapter3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max;
		
		if(a>b) {
			if(c>a) {
				max=c;
			} else {
				max=a;
			}
		} else {
			if(c>b) {
				max=c;
			} else {
				max=b;
			}
		}
		System.out.println(max);
	}

}
