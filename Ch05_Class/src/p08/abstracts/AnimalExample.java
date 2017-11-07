package p08.abstracts;

public class AnimalExample {

	public static void main(String[] args) {
		
		Bird1 bird = new Bird1();
		Insect1 insect = new Insect1();
		Fish1 fish = new Fish1();

		Animal [] animals = new Animal[3];
		
		animals[0] = bird;
		animals[0] = insect;
		animals[0] = fish;
		
		for(int i=0;i<animals.length;i++) {
			animals[i].sing();
			animals[i].fly();
			animals[i].eat();
		}
	
	}
}
