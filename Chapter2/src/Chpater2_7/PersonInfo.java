package Chpater2_7;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("������ : ");
		short kg = input.nextShort();
		System.out.printf("Ű: ");
		float cm = input.nextFloat();
		
		System.out.println("������ : "+kg+"kg, Ű : "+cm+"cm");
	}

}
