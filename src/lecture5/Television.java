package lecture5;

public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV is off");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume< RemoteControl.MAX_VOLUME && volume > RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}
		else {
			System.out.println("Failed to increase volume\nsetting volume to default(5)");
			this.volume=5;
		}
		System.out.println("current volume is : "+ this.volume);
	}

}
