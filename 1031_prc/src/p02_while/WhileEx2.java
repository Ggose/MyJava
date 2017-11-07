package p02_while;

import java.io.*;

public class WhileEx2 {

   public static void main(String[] args) {
      System.out.println("값을 입력");
      try {
         int num = System.in.read() - '0';
         int i = 1;
         if (num >= 2 && num <= 9) {
            while (i <= 9)
               System.out.println(num + "x" + i + "=" + num * i + "  ");
            i++;

         } else {
            System.out.println("2~9까지의 숫자를 입력하시오:" + "");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}