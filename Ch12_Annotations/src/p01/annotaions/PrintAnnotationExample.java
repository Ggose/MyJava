package p01.annotaions;

import java.lang.reflect.Method;

/**
 * annotation의 적용
 */
public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service클래스로부터 메소드 정보 얻기
		Method[] declaredMethods 
		         = Service.class.getDeclaredMethods();//Service클래스의 메소드3개를 저장
		//
		for (Method method : declaredMethods) {
			// Annotation 적용여부확인
			if (method.isAnnotationPresent(PrintAnnotaion.class)) {
				// PrintAnnotation 정보 얻기
				PrintAnnotaion printAnnotaion = method.getAnnotation(PrintAnnotaion.class);

				// 메솓 이름 출력
				System.out.println("[" + method.getName() + "]");
				// 구분선 출력-PrintAnnotation에 적용된 요소로 출력
				for (int i = 0; i < printAnnotaion.number(); i++) {//반복횟수
					System.out.print(printAnnotaion.value());//출력값
				}
				System.out.println();
				try {
					// 메소드 호출
					method.invoke(new Service());//인스턴스메소드 호출 invoke();
				} catch (Exception e) {
				}
				System.out.println();
			}
		}
	}
}