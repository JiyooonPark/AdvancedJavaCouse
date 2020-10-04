package lecture5;

public class RemoteTest {
	public static void main (String [] args) {
		Television tv = new Television();
		tv.setVolume(11);
		tv.turnOn();
		tv.turnOff();
	}
}
