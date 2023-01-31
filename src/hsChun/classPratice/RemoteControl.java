package hsChun.classPratice;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	int MAX_CHANNEL = 100;
	int MIN_CHANNEL = 0;
		
 	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public void setChannel(int channel);
	public void mute();
	public void prevChannel();
}
