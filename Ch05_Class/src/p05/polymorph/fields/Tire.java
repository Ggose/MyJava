package p05.polymorph.fields;

public class Tire {

	//필드
	public int maxRotation; //타이어수명
	public int accumulateRotation; //누적횟수
	public String location; //타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;	//위치
		this.maxRotation = maxRotation;	//최대수명
	}
	
	//메소드
	
	public boolean roll() {
		++accumulateRotation; //누적회전수 증가
		if(accumulateRotation<maxRotation) {
			System.out.println(location+ "Tire 남은 수명"+(maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println("***"+location+"Tire 교ㅔ");
			return false;
		}
	}
}
