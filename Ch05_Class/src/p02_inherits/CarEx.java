package p02_inherits;

public class CarEx {

	   public static void main(String[] args) {

	      Bus bus = new Bus();
	      System.out.println("ž���ο�" + bus.a);
	      bus.move();

	      Ambulance amulance = new Ambulance();
	      amulance.move();
	      amulance.special();

	      FireEngine fireEngine = new FireEngine();
	      fireEngine.move();
	   }
	}