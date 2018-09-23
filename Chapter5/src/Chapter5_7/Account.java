package Chapter5_7;

public class Account {
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
	Account(){
		owner = "JSH";
		balance=0;
	}
	Account(String owner){
		this.owner = owner;
		this.balance=0;
	}
	Account(long balance){
		this.owner="JSH";
		this.balance=balance;
	}
	Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	public long deposit(long amount) { // 저축 메소드
		this.balance+=amount;
		return this.balance;
	}
	public long withdraw(long amount) { // 인출 메소드
		this.balance-=amount;
		return this.balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("SH",100_000);
		a.deposit(10000);
		a.withdraw(5000);
		System.out.println(a.getBalance());
	}

}
