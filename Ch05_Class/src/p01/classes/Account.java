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

		   int getBalance() {// �ܰ� ���
		      return balance;
		   }

		   void setBalance(int balance) {
		      this.balance = balance;
		   }

		   void deposit(int amount) {// �Ա� �޼ҵ�
		      this.balance += amount;

		   }

		   int withdraw(int amount) {// ��� �޼ҵ�
		      this.balance -= amount;

		      return amount;
		   }

		   public static void main(String args[]) {
		   }
}
