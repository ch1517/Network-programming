package Chapter3_7;

import java.util.Scanner;

public class Chapter3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		if(month>=1&&month<=6) {
			System.out.println("��ݱ��Դϴ�.");
		} else if(month>=7&&month<=12) {
			System.out.println("�Ϲݱ��Դϴ�.");
		} else {
			System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
		}
	}

}
