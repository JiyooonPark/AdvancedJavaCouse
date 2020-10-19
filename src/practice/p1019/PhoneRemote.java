package practice.p1019;

public class PhoneRemote implements Remote{
    int volume;
    @Override
    public void volumeUp() {
        volume += 10;
    }

    @Override
    public void volumeDown() {
        volume -=10;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
