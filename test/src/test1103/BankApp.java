package test1103;

import java.util.Scanner;

public class BankApp {

   private static Account[] accountArray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      boolean run = true;
      while (run) {
         System.out.println("-----------------------------------");
         System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
         System.out.println("-----------------------------------");
         System.out.println("선택 >>");

         int selectNo = scanner.nextInt();

         switch (selectNo) {
         case 1:
            createAccount();
            break;
         case 2:
            accountList();
            break;
         case 3:
            deposit();
            break;
         case 4:
            withdraw();
            break;
         case 5:
            run = false;
            break;
         }
      }
      System.out.println("프로그램 종료");
   }

   private static void withdraw() {
      //계좌번호 선택
      //출금(잔액<출금액)
         System.out.println("계좌번호 선택하세요 :");
            int selectAccount = scanner.nextInt();
            System.out.println("출금 금액 적으세요 :");
            int money = scanner.nextInt();
            accountArray[selectAccount].setBalance2(money);
            System.out.println("출금 후 금액은 "+accountArray[selectAccount].getBalance());
      
   }

   private static void deposit() {
      //계좌번호 선택
      //입금
        //계좌번호 선택
         System.out.println("계좌번호 선택하세요 :");
         int selectAccount = scanner.nextInt();
         System.out.println("입금 금액 적으세요 :");
         int money = scanner.nextInt();
         accountArray[selectAccount].setBalance(money);
         
         System.out.println("총금액은 "+accountArray[selectAccount].getBalance());
         //입금
      
   }

   private static void accountList() {
      for(int i = 0;i<accountArray.length;i++) {
         System.out.println(
               accountArray[i].getAno()+accountArray[i].getOwner()+accountArray[i].getBalance());
         System.out.println("계좌리스트를 더 보시겠습니까? (종료하려면 -1)");
         int b = scanner.nextInt();
         if(b ==-1)
            break;
      }
   }

   private static void createAccount() {
      //Bank-0001, 홍길동 , 100000
   
      
      
      for(int i = 0;i<accountArray.length;i++) {
         System.out.println("EX)Bank-0001, 홍길동 , 100000");
      
         String ano= scanner.next();
         String onwer = scanner.next();
         int balance = scanner.nextInt();
         
         accountArray[i] 
               = new Account(ano,onwer,balance);
         System.out.println("계좌를 더 생성하시겠습니까? (종료하려면 -1)");
         int b = scanner.nextInt();
         if(b ==-1)
            break;
      }//메소드끝.
   }
}