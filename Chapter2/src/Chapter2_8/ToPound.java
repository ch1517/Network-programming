package Chapter2_8;

import java.util.Scanner;

public class ToPound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double kg = input.nextDouble();
		System.out.println("kg : "+kg);
		System.out.println("lb : "+2.2*kg); // 1 kg = 2.2 lb;
	}

}
