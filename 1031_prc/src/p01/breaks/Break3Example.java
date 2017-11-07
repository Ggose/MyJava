package p01.breaks;
/*
 * break문
 */
public class Break3Example {

	public static void main(String[] args) {
		
		int i = 0; int j = 0;
		while(true) {//바깥쪽 while()시작
			i++;
			while(true) {//안쪽 while문 시작
				System.out.println(j+"\t");
				if(j==5)break;//안쪽 while문 종료 j++실행하지않고 빠져나간다
				j++;
			}//안쪽 while문 끝
			System.out.println("i ="+i);
			if(i==10)break;//바깥 while문 종료
		}//바깥쪽 while문 끙
		System.out.println("종료");
	}
}
