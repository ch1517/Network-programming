package Chapter3_5;

import java.util.Scanner;

public class Chapter3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		char c; // �����̸� a, ����̸� b
		if(year%4==0) { // 4�� ������ �������� �ش� ����
			if(year%100==0) { // �� �߿� 100���� ������ �������� �ش� ���
				if(year%400==0) { // �� �߿� 400���� ������ �������� �ش� ����
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
			System.out.println("����");
		} else {
			System.out.println("���");
		}
	}

}
