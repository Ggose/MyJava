package p06.strings;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		byte[] bytes = new byte[100];
		
		System.out.print("입력:");
		try {
			//read(배열) - 값을 읽어서 배열에 저장후
			            // 읽은 값의 길이를 readByteNo에 대입
			int readByteNo = System.in.read(bytes);
			//breaByteNo -2 : 키보드에 값을 입력후 에터키를 치면
			//               CR,LF키가 입력
			//               엔터키 값을 제외한 실제입력값만 받음.
 			String str = new String(bytes,0,readByteNo-2);
			System.out.println(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
