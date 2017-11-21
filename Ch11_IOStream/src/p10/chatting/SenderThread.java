package p10.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 송신 thread 객체
 */
public class SenderThread extends Thread {
	// 필드
	Socket socket;
	// 생성자

	public SenderThread(Socket socket) {
		super();
		this.socket = socket;
	}

	// 메소드
	@Override
	public void run() {
		try {
			// 입력으로 들어오는 스트림의 속도 향상
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter write = new PrintWriter(socket.getOutputStream()); // 출력스트림
			while (true) {
				String str = reader.readLine();// 입력된 데이터를 한줄단위로 읽음
				if (str.equals("bye"))
					break;// 입력값이 bye면 클라이언트 종료
				write.println(str); // bye가 아니면 메세지 전송
				write.flush();// 버퍼내의 데이터 밀어내기
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//클라이언트 종료시 반드시 소켓해제
			}catch(Exception e) {}
		}

	}

}
