package Chapter7_3;

public class Chapter7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;
		
		System.out.println(s1 == s2); // s2와 s1은 주소가 다르므로 false
		System.out.println(s1.equals(s2)); // s1와 s2의 값이 같으므로 true
		System.out.println(s2 == s3); // s3은 s2와 같은 객체를 가르키고 있으므로 주소가 같음 true
		System.out.println(s2.equals(s3)); // s2와 s3의 값이 같으므로 true
	}

}
