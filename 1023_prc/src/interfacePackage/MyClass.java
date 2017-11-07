package interfacePackage;

public class MyClass implements MyInterface {

	

	
	

	@Override
	public int getRandomNumber() {
		// TODO Auto-generated method stub
		return (int) Math.floor((Math.random()*10));
	}

	@Override
	public int getCeilNumber(double number) {
		// TODO Auto-generated method stub
		return (int) Math.ceil(number);
	}

	public void doSomething() {
		System.out.println("π∫∏ª¿Œ∞°");
	}
}
