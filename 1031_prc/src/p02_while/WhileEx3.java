package p02_while;

import java.util.*;

public class WhileEx3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int i = 1, j = 2;
      boolean isContinue = true;
      while (isContinue) {
         System.out.println("구구단을 입력");
         int num = sc.nextInt();
         while (i <= 9)
            while (j <= num) {
               System.out.print(j + "x" + i + "=" + j * i + "       ");
               j++;
            }
         System.out.println();
         j = 2;
         i++;
      }
      System.out.println("계속하시겟습니까");
      char c = sc.next().charAt(0);
      if (!(c == 'y' || c == 'Y'))
         isContinue = false;
      else
         isContinue = true;
   }

}