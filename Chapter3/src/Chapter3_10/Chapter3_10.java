package Chapter3_10;

import java.util.Scanner;

public class Chapter3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int money=input.nextInt();
		int tmp=money;
		int a,b,c,d; // ���ʴ�� 50000, 10000, 5000, 1000 �� �� ����
		if(money>=1000) {
			a=tmp/50000;
			tmp%=50000;
			b=tmp/10000;
			tmp%=10000;
			c=tmp/5000;
			tmp%=5000;
			d=tmp/1000;
			System.out.println("50000���� "+a+"��, 10000���� "+b+"��, 5000���� "+c+"��, 10000���� "+d+"��");
		}else {
			System.out.println("�ּ� õ �� ������ �Է����ּ���.");
		}
	}

}
