package dmMoon.classPractice;

/*
 * RemoteControl 객체를 추상화한 인터페이스
 */

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
 	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
