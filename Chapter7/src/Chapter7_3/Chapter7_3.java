package Chapter7_3;

public class Chapter7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;
		
		System.out.println(s1 == s2); // s2�� s1�� �ּҰ� �ٸ��Ƿ� false
		System.out.println(s1.equals(s2)); // s1�� s2�� ���� �����Ƿ� true
		System.out.println(s2 == s3); // s3�� s2�� ���� ��ü�� ����Ű�� �����Ƿ� �ּҰ� ���� true
		System.out.println(s2.equals(s3)); // s2�� s3�� ���� �����Ƿ� true
	}

}
