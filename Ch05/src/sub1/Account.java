package sub1;

public class Account {
	
	// 속성(필드)
	String bank;
	String id;
	String name;
	int balance;
	
	
	// 기능
	public void withdraw(int amount) {
		this.balance -= amount;
		
	}	
	
	public void deposit (int amount) {
		this.balance += amount;
		
	}	
	
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("예금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balance);
		
	}
	
	
	
}
