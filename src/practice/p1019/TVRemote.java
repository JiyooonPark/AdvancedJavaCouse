package practice.p1019;

public class TVRemote implements Remote {
    int volume;
    @Override
    public void volumeUp() {
        volume ++;
    }

    @Override
    public void volumeDown() {
        volume --;
    }

    public int getVolume(){
        return volume;
    }
}
