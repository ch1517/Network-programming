package Chapter5_8;

public class AccountTest {
	private String owner;
	private long balance;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	AccountTest(){
		owner = "JSH";
		balance=0;
	}
	AccountTest(String owner){
		this.owner = owner;
		this.balance=0;
	}
	AccountTest(long balance){
		this.owner="JSH";
		this.balance=balance;
	}
	AccountTest(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	public long deposit(long amount) { // 저축 메소드
		this.balance+=amount;
		return this.balance;
	}
	public long withdraw(long amount) { // 인출 메소드
		if(this.balance>=amount)
			this.balance-=amount;
		else
			System.out.println("잔액이 부족합니다.");
		return this.balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountTest a = new AccountTest("SH",100_000);
		a.withdraw(150_000);
		a.deposit(10000);
		a.withdraw(5000);
		System.out.println(a.getBalance());
	}

}
