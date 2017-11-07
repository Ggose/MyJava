package p01.classes;


	public class Account {
		   private String owner;
		   private int balance;

		   String getOwner() {
		      return owner;
		   }

		   void setOwner(String owner) {//
		      this.owner = owner;
		   }

		   int getBalance() {// 잔고 출력
		      return balance;
		   }

		   void setBalance(int balance) {
		      this.balance = balance;
		   }

		   void deposit(int amount) {// 입금 메소드
		      this.balance += amount;

		   }

		   int withdraw(int amount) {// 출금 메소드
		      this.balance -= amount;

		      return amount;
		   }

		   public static void main(String args[]) {
		   }
}
