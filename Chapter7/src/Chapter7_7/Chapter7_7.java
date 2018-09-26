package Chapter7_7;

import java.util.HashSet;
import java.util.Scanner;

public class Chapter7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String tmp;
		HashSet<String> set1 = new HashSet<String>(); // 중복되지 않은 문자열
		HashSet<String> set2 = new HashSet<String>(); // 중복된 문자열
		System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");
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
		System.out.println("중복되지 않은 문자열 =>"+ set1+"\n");
		System.out.println("중복된 문자열 =>"+ set2);
	}

}
