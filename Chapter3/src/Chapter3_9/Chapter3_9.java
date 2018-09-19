package Chapter3_9;

import java.util.Scanner;

public class Chapter3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cm = input.nextInt();
		int kg = input.nextInt();
		
		if(kg<=(cm-100)*0.9) {
			System.out.println("정상");
		} else {
			System.out.println("비만");
		}
	}

}
