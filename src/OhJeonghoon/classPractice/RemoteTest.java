package OhJeonghoon.classPractice;

public class RemoteTest {

	public static void main(String[] args) {
		
		/*
		 * 4 번 문제에서는 테스트 코드를 수정하지 마시오.
		 */
		RemoteControl rControl = new Tv();
		
		rControl.turnOn();
		
		rControl.setVolume(5);

		rControl.setVolume(-10);
		
		rControl.setChannel(5);
		
		rControl.setChannel(7);
		
		rControl.setPreChannel();
		
		rControl.mute(0);
		
		rControl.turnOff();
		
		
		RemoteControl radioControl = new Radio();
		
		radioControl.turnOn();
		
		radioControl.setVolume(5);

		radioControl.setVolume(-10);
		
		radioControl.setChannel(15);
		
		radioControl.setChannel(110);
		
		radioControl.turnOff();
		
		
	}

}
