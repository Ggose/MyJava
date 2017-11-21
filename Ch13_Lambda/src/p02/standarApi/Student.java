package p02.standarApi;

public class Student {
	//필드
	private String name;
	private int engScore;
	private int mathScore;
	//생성자
	public Student(String name, int engScore, int mathScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	//메소드
	public String getName() {return name;}
	public int getEngScore() {	return engScore;	}
	public int getmathScore() {	return mathScore;	}
	
	
	
	
}
