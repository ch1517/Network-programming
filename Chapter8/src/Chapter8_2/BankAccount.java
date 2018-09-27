package Chapter8_2;

import javax.activity.InvalidActivityException;

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class BankAccount {
	int minmoney;
	int money;
	public BankAccount(int minmoney) {
		this.minmoney = minmoney;
		money=0;
	}
	void deposit(int money) throws InvalidActivityException {
		if(money<0) 
			throw new InvalidActivityException("양수를 입력하세요");
		else {
			this.money += money;
		}
	}
	void withdraw(int money) throws InvalidActivityException {
		this.money -= money;
		if(money<0) 
			throw new InvalidActivityException("양수를 입력하세요");
		else {
			if(this.money<this.minmoney)
				throw new InvalidActivityException("최대 인출 금액을 초과했습니다.");
		}
	}
}
