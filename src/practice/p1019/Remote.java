package practice.p1019;

public interface Remote {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void volumeUp();
    void volumeDown();
    int getVolume();

}
