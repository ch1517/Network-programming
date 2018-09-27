package Chapter8_3;

import javax.activity.InvalidActivityException;

class InvalidWithdraw extends RuntimeException {
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
	void deposit(int money) {
		if(money<0)
			try {
				throw new InvalidActivityException("양수를 입력하세요");
			} catch (InvalidActivityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			this.money += money;
			System.out.printf("정상 입금처리 : 입금금액=%6d, 잔금 =%6d\n",money,this.money);
		}
	}
	void withdraw(int money)  {
		this.money -= money;
		if(money<0)
			try {
				throw new InvalidActivityException("양수를 입력하세요");
			} catch (InvalidActivityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			if(this.money<this.minmoney)
				try {
					throw new InvalidActivityException("초과출금 요구 예외");
				} catch (InvalidActivityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
				System.out.printf("정상 출금처리 : 출금금액=%6d, 잔금 =%6d\n",money,this.money);
		}
	}
}
