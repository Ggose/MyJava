package p09_interfaces;
/*
 * interface의 구현객체 생성
 *  - class 클래스명 implements 인ㅌ페이스
 */
public class Audio implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 Audio볼륨은 : "+volume);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		
	}

}
