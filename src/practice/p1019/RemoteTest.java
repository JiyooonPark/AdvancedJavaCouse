package practice.p1019;

public class RemoteTest {
    public static void main(String [] args){
        TVRemote t = new TVRemote();
        PhoneRemote p = new PhoneRemote();

        for(int i=0; i<10; i++){
            t.volumeUp();
            p.volumeUp();
            System.out.println("TV: "+ t.getVolume() + " \nPhone : "+ p.getVolume());
        }
    }
}
