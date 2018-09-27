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
				throw new InvalidActivityException("����� �Է��ϼ���");
			} catch (InvalidActivityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			this.money += money;
			System.out.printf("���� �Ա�ó�� : �Աݱݾ�=%6d, �ܱ� =%6d\n",money,this.money);
		}
	}
	void withdraw(int money)  {
		this.money -= money;
		if(money<0)
			try {
				throw new InvalidActivityException("����� �Է��ϼ���");
			} catch (InvalidActivityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			if(this.money<this.minmoney)
				try {
					throw new InvalidActivityException("�ʰ���� �䱸 ����");
				} catch (InvalidActivityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
				System.out.printf("���� ���ó�� : ��ݱݾ�=%6d, �ܱ� =%6d\n",money,this.money);
		}
	}
}
