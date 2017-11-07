package p02_inherits;

public class CarEx {

	   public static void main(String[] args) {

	      Bus bus = new Bus();
	      System.out.println("Å¾½ÂÀÎ¿ø" + bus.a);
	      bus.move();

	      Ambulance amulance = new Ambulance();
	      amulance.move();
	      amulance.special();

	      FireEngine fireEngine = new FireEngine();
	      fireEngine.move();
	   }
	}