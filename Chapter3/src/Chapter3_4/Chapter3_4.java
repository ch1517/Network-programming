package Chapter3_4;

import java.util.Scanner;

public class Chapter3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		double num = input.nextDouble();
		if(c=='C'||c=='c') {
			System.out.println("����(C) : "+num+", ȭ��(F) :"+(9.0/5.0)*num+32);
		} else if(c=='F'||c=='f') {
			System.out.println("ȭ��(F) : "+num+", ����(C) :"+(5.0/9.0)*(num-32));
		} else {
			System.out.println("�߸��� ���� �Է�");
		}
	}

}
