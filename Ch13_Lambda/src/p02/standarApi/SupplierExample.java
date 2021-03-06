package p02.standarApi;
/*
 * Supplier 함수적 인터페이스
 * -매개변수가 없고 리턴문을 가진 추상메소드
 * ()->{}
 */
import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {

			return (int) (Math.random() * 6) + 1;
		};
		int num = intSupplier.getAsInt();
		System.out.println("결과 : "+num);

	}
}
