package lecture13;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<10; i=i+2){
            System.out.println(i);
        }
    }
    public static void main(String [] args){
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
