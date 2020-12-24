package lecture13;

public class MyMulti1 implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" 시작");
        for(int i=0; i<5; i++){
            System.out.println(name+" "+i);
        }
    }
    public static void main(String [] args){
        MyMulti1 app = new MyMulti1();
        for(int i=0; i<5; i++){
            Thread t=new Thread(app);
            t.start();
        }
        System.out.println("main 종료");
    }
}
