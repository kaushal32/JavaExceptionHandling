class Even extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class Odd extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        try {
            e.join();
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Current Thread Caught");
        }
        o.start();
    }
}