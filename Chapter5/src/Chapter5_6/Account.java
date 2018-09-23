package Chapter5_6;

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
