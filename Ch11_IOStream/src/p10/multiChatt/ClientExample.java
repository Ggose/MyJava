package p10.multiChatt;

import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("localhost",5001);//소켓생성
			Thread th1 = new SenderThread(socket, "sewonc");//쓰레드 생성
			Thread th2 = new ReceiverThread(socket);//쓰레드 생성
			th1.start();//쓰레드 호출
			th2.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
