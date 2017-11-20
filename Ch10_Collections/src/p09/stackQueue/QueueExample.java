package p09.stackQueue;
//작업객체인 경우 queue에 저장하여 순서대로 실행하는 경우 사용
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		//offer() queue에 객체 저장
		messageQueue.offer(new Message("SendMail","홍길동"));
		messageQueue.offer(new Message("SendSMS","일지매"));
		messageQueue.offer(new Message("SendKatok","임꺽정"));
		
		while(!messageQueue.isEmpty()) { //비어있는지 확인 메소드
			Message message = messageQueue.poll(); //가장먼저 저장된 객체(작업)출력
			switch(message.command) { //switch("문자열")<-자바 7에서 추가
			case "SendMail" :
				System.out.println(message.to+"님에게 메일을 보냅니다");
				break;
			case "SendSMS" :
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "SendKatot" :
				System.out.println(message.to+"님에게 카톡을 보냅니다.");
				break;
			}
		}

		
	}
}
