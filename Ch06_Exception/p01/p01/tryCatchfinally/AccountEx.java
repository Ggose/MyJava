package p01.tryCatchfinally;

public class AccountEx {
	  public static void main(String[] args) {
	      Account account1 = new Account();
	      account1.owner = "이순신";
	      account1.ano = "111-001";
	      account1.balance = 20000;
	      String name = account1.getOwner();
	      String ano = account1.getOwner();
	      long balace = account1.getBalance();
	      System.out.println("소유자:" + name + " " + "계좌번호:" + ano + " " + "잔액:" + balace);

	      Account account2 = new Account("홍길동");
	      account2.ano = "111-004";
	      account2.balance = 50000;

	      String name2 = account2.getOwner();
	      String ano2 = account2.getOwner();
	      long balace2 = account2.getBalance();
	      System.out.println("소유자:" + name2 + " " + "계좌번호:" + ano2 + " " + "잔액:" + balace2);

	      Account account3 = new Account("일지매", "111-002");
	      account3.balance = 90000;

	      String name3 = account3.getOwner();
	      String ano3 = account3.getOwner();
	      long balace3 = account3.getBalance();
	      System.out.println("소유자:" + name3 + " " + "계좌번호:" + ano3 + " " + "잔액:" + balace3);

	      Account account4 = new Account("임꺽정", "111-003", 10000);
	      String name4 = account4.getOwner();
	      String ano4 = account4.getOwner();
	      long balace4 = account4.getBalance();
	      System.out.println("소유자:" + name4 + " " + "계좌번호:" + ano4 + " " + "잔액:" + balace4);

	      account4.deposit(500000);
	      long amt = account4.getBalance();
	      System.out.println("현재 잔액" + amt);

	      // 출금처리
	      // 호출되는 메소드가 throws exception{}으로 선언되어있으면
	      // 호출하는 곳에서 예외처리를 해줘야함

	      try {
	         account4.withdraw(500000);
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	         // 호출된 메소드의 exception()의 생성자 매개변수의 메세지를 받아서 출력
	      }
	      
	   }

}
