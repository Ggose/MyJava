package p02_inherits;

public class CarEx2 {

	   public static void main(String[] args) {
	      Car[] car = new Car[4];

	      Car car1 = new Car();
	      Bus bus = new Bus();

	      Ambulance ambulance = new Ambulance();
	      FireEngine fireEngine = new FireEngine();

	      car[0] = car1;
	      car[1] = bus;
	      car[2] = ambulance;
	      car[3] = fireEngine;
	      /*
	       * for (Car c : car) { c.move(); System.out.println(c.a); if (c instanceof
	       * Ambulance) { Ambulance am = (Ambulance) c; am.special(); } }
	       */
	      for (int i = 0; i < car.length; i++) {
	         car[i].move();
	         System.out.println(car[i].a);
	      
	      if (car[i] instanceof Ambulance) {
	         Ambulance am = (Ambulance) car[i];
	         am.special();
	      }
	      }
	   }

	}
