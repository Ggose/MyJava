package p10.maths;
/*
 * Random클래스 Random(){},Random(seed){} //seed:랜덤값을 고정시키는것
 *
 *	Random()생성자의 매개변수가 없으면,실행시 마다  무작위로 난수가 발생
 *	Random(seed) 매개변수로 값을 넘겨주면 처음 생성된 무작위 난수가 고정됨.
 *				다시 실행을 하여도 처음 발생한 난수를 그대로 보여줌.
 */
import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[]selectNumber=new int[6];//int타입의 배열
		Random random = new Random();
		System.out.println("선택 번호");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1; //0~45까지 난수발생
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		//당첨자번호(자동발번)
		int []winNumber = new int[6];
		random = new Random();
		System.out.println("당첨 번호");
		for(int i=0;i<6;i++) {
			winNumber[i]=random.nextInt(45)+1;
			System.out.print(winNumber[i]+" ");
		}
		System.out.println();
		//당첨여부확인
		Arrays.sort(selectNumber);//정렬
		Arrays.sort(winNumber);//정렬
		//1차원 배열의 요소들의 값이 기본데이터 타입(참조타입이 아님)
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.print("당첨여부");
		if(result)
			System.out.println("1등 당첨");
		else
			System.out.println("1등 당첨 실패");
	}
}
