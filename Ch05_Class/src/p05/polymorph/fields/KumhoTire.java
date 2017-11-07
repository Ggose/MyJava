package p05.polymorph.fields;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {

		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location+"KumhoTire 교체"+(maxRotation-accumulateRotation));
			return true;	//if~else인 경우 return true/return false로 둘중하나 선택하는 형식으로 기술.
		}else {
			System.out.println("***"+location+"KumhoTire Tire 교체");
			return false;
		}
	}
}
