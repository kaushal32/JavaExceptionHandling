public class PriorityThreads extends Thread {
    @Override
    public void run(){
        System.out.println(getName());
        System.out.println(getPriority());
    }
}
class Test{
    public static void main(String[] args) {
        PriorityThreads ob1 = new PriorityThreads();
        PriorityThreads ob2 = new PriorityThreads();
        PriorityThreads ob3 = new PriorityThreads();
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(Thread.MIN_PRIORITY);
        ob3.setPriority(Thread.NORM_PRIORITY);
        ob1.start();
        ob2.start();
        ob3.start();
    }
}