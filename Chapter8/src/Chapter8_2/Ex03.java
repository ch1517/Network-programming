package Chapter8_2;

import javax.activity.InvalidActivityException;

public class Ex03 {

	public static void main(String[] args) throws InvalidActivityException {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(500000);
	}

}
