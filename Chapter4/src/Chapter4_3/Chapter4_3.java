package Chapter4_3;

import java.util.Scanner;

public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		do {
			System.out.print(n%10); // ���� �ڸ� ���
			n/=10; // ���� �ڸ� ���ڸ� �����ϰ� ���ο� ���� ����
		} while(n!=0);
			
	}

}
