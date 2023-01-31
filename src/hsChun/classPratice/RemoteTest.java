package hsChun.classPratice;

public class RemoteTest {

	public static void main(String[] args) {
		
		RemoteControl rControl = new Tv();
		rControl.turnOn();
		rControl.setVolume(5);
		rControl.setVolume(-10);
		rControl.turnOff();
		
		System.out.println();
		
		RemoteControl rControl2 = new Radio();
		rControl2.turnOn();
		rControl2.setVolume(5);
		rControl2.setVolume(-10);
		rControl2.setChannel(15);
		rControl2.setChannel(37);
		rControl2.setChannel(1000);
		rControl2.mute();
		rControl2.prevChannel();
		rControl2.turnOff();
	}

}
