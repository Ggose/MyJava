package p02_inherits;

public class Car {
	   int a = 7;// ž���ο�

	   // �޼ҵ�
	   void move() {
	      System.out.println("�̵��Ѵ�");
	   }
	}

	class Bus extends Car {
	   int a = 26;

	   void move() {
	      System.out.println(a + "���� �¿�� �̵��Ѵ�.");
	   }

	}

	class Ambulance extends Car {
	   int a = 10;

	   void move() {
	      System.out.println("���̷��� �︮�鼭 �̵��Ѵ�.");
	   }

	   void special() {
	      System.out.println("ȯ�ڸ� �¿�� �̵��Ѵ�.");
	   }
	}

	class FireEngine extends Car {
	   int a = 11;// ������

	   void move() {
	      System.out.println("���� �Ѹ��鼭 �̵��Ѵ�");
	   }

	}