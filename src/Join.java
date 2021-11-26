public class Th_Cont_Mech implements Runnable {
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
                if (i != 6) {
                    System.out.println(i);
                }
                else{
                    try {
                        Thread.sleep(5000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        System.out.println("Exception Caught");
                    }
                }
            }
        }
}
class Testtt{
    public static void main(String[] args) {
        Th_Cont_Mech obj = new Th_Cont_Mech();
        Thread obj1 = new Thread(obj);
        Thread obj2 = new Thread(obj);
        Thread obj3 = new Thread(obj);
        obj1.start();
        try {
            obj1.join();
            obj2.start();
            obj2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj3.start();
    }
}
