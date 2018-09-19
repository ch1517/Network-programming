package Chapter3_6;

import java.util.Scanner;

public class Chapter3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int tmp; // 임시 변수
		int mm=num/10000; //만의 자리 수
		tmp=num%10000;
		int k=tmp/1000; //천의 자리 수
		tmp=num%1000;
		int m=tmp/100; //백의 자리 수
		tmp=num%100;
		int t=tmp/10; // 십의 자리 수
		int n=tmp%10; //일의 자리 수
		System.out.println(mm+"만 "+k+"천 "+m+"백 "+t+"십 "+n+"입니다.");
	}

}
