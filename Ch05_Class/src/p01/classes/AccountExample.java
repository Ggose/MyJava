package p01.classes;

public class AccountExample {

	public static void main(String[] args) {
		//��ü(instance)����
		Account account;
		account = new Account(); //����(Account)instance ���� �� ����
		account.setOwner("ȫ�浿");
		account.setBalance(10000); //setBalance(��) ->balance�ʵ忡 ����
		
		System.out.println(account.getOwner()+" "+account.getBalance());
		
		
		
		//�߰��Ա�
		account.deposit(5000); //Ŭ������ ����� deposit(){}�޼ҵ带 ���ؼ� balance
								//�ʵ忡 ����
		System.out.println(account.getOwner()+" "+account.getBalance());
		//���
		account.withdraw(12000);
		System.out.println(account.getBalance());
	}
}
