package p02_while;

import java.io.*;

public class WhileEx2 {

   public static void main(String[] args) {
      System.out.println("���� �Է�");
      try {
         int num = System.in.read() - '0';
         int i = 1;
         if (num >= 2 && num <= 9) {
            while (i <= 9)
               System.out.println(num + "x" + i + "=" + num * i + "  ");
            i++;

         } else {
            System.out.println("2~9������ ���ڸ� �Է��Ͻÿ�:" + "");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}