package OhJeonghoon.classPractice;

public class Radio implements RemoteControl{

	int channel;
	int preChannel;
	@Override
	public void turnOn() {
		
		System.out.println("Radio (을)를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("Radio (을)를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume < MIN_VOLUME || volume >MAX_VOLUME) {
			System.out.println("볼륨은 0~10사이로 조정해주세요.");
			
		}
		else {
			
			System.out.println("볼륨이"+ volume +"(으)로 조정되었습니다.");
		}
		
	}

	@Override
	public void setChannel(int channel) {
		
		if(channel < MIN_CHANNEL || channel >MAX_CHANNEL) {
			System.out.println("채널은 0~100사이로 조정해주세요.");
			
		}
		else {
			preChannel=this.channel;
			this.channel=channel;
			System.out.println("채널이"+ channel +"(으)로 조정되었습니다.");
		}
		
	}
	@Override
	public void setPreChannel() {
		
			channel=preChannel;
			System.out.println("이전 채널이"+ channel +"(으)로 조정되었습니다.");
		
	}
	
	@Override
	public void mute(int volume) {
		
		volume=0;
		System.out.println("음소거중입니다.");
		
	}
	

	

}
