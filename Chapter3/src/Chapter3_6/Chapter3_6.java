package Chapter3_6;

import java.util.Scanner;

public class Chapter3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int tmp; // �ӽ� ����
		int mm=num/10000; //���� �ڸ� ��
		tmp=num%10000;
		int k=tmp/1000; //õ�� �ڸ� ��
		tmp=num%1000;
		int m=tmp/100; //���� �ڸ� ��
		tmp=num%100;
		int t=tmp/10; // ���� �ڸ� ��
		int n=tmp%10; //���� �ڸ� ��
		System.out.println(mm+"�� "+k+"õ "+m+"�� "+t+"�� "+n+"�Դϴ�.");
	}

}
