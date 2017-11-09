package p01.tryCatchfinally;
/*
 * 소유자 : String 타입의 필드 - owner
 * 계좌번호 : String 타입의 필드 - ano
 * 잔액 : long타입의 필드  - balance
 */
public class Account {
	//소유자
	String owner;//소유자
	String ano; //계좌번호
	long balance;//잔액
	
	//생성자 오버라이딩
	Account(){}
	Account(String owner){ //(String)
		this.owner = owner;
	}
	Account(String owner,String ano){ //(String,String)
		this.owner = owner;
		this.ano = ano;
	}
	public Account(String owner, String ano, long balance) {//String,String,long
		super();
		this.owner = owner;
		this.ano = ano;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	//메소드
	public void deposit(int amount)  {
		balance+=amount;
	}
	public int withdraw(int amount) throws Exception {
		if(balance <amount)
			throw new Exception("잔액이 모자랍니다.");
		else {
			balance-=amount;
		}
		return amount;		
	}

}
