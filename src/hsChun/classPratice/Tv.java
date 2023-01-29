package hsChun.classPratice;

public class Tv implements RemoteControl {
	
	int volume;
	int channel;
	int prevChannel;

	@Override
	public void turnOn() {
		System.out.println("Tv (을)를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv (을)를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
			System.out.printf("볼륨이 %d (으)로 조정되었습니다.\n", volume);
		}
		else
			System.out.println("볼륨은 0~10 사이로 조정해주세요.");
	}
	
	@Override
	public void setChannel(int channel) {
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.prevChannel = this.channel;
			this.channel = channel;
			System.out.printf("채널이 %d (으)로 조정되었습니다.\n", channel);
		}
		else
			System.out.println("채널은 0~100 사이로 조정해주세요.");
	}
	
	@Override
	public void mute() {
		this.volume = 0;
		System.out.println("음소거 되었습니다.");
	}
	
	@Override
	public void prevChannel() {
		channel = prevChannel;
		System.out.printf("이전 채널인 채널 %s로 이동합니다.\n", prevChannel);
	}
}
