public class ThContMech{
    public static void main(String[] args) {
        Thread obj = new Thread(new Runnable(){
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
        });
        obj.start();
    }
}