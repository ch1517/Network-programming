package Chapter7_7;

import java.util.HashSet;
import java.util.Scanner;

public class Chapter7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String tmp;
		HashSet<String> set1 = new HashSet<String>(); // �ߺ����� ���� ���ڿ�
		HashSet<String> set2 = new HashSet<String>(); // �ߺ��� ���ڿ�
		System.out.println("ǥ���Է����� ���ڿ��� ���� �ٿ� �Է��ϼ���.");
		System.out.println("����� ���÷��� �������� ǥ���Է����� quit�� �Է��ϼ���.");
		while(true) {
			tmp = s.next();
			if(tmp.equals("quit")) {
				break;
			} else {
				if(set1.contains(tmp)) {
					set2.add(tmp);
					set1.remove(tmp);
				} else {
					set1.add(tmp);
				}
			}
		}
		System.out.println("�ߺ����� ���� ���ڿ� =>"+ set1+"\n");
		System.out.println("�ߺ��� ���ڿ� =>"+ set2);
	}

}
