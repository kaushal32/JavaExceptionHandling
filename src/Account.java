public class Accountt {
    public int balance;
    public Accountt(){
        balance = 10000;
    }
    public void withdraw(int val)throws InterruptedException{
        synchronized (this){
            Thread.sleep(1000);
            balance= balance-val;
            System.out.println(balance);
        }
    }
}
class Mythread extends Thread{
    Accountt obj;
    Mythread(Accountt tobj){
        obj=tobj;
    }
    @Override
    public void run(){
        try {
            obj.withdraw(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Tesst{
    public static void main(String[] args) {
        Accountt obj = new Accountt();
        Mythread t1 = new Mythread(obj);
        Mythread t2 = new Mythread(obj);
        t1.start();
        t2.start();
    }
}
