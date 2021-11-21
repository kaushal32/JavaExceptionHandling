import java.util.Random;
public class Colours{
    public static void main(String[] args) {
    Thread ob = new Thread(new Runnable(){
        String colours[]= {"white","blue","black","green","red","yellow"};
        Random r = new Random();
        int i;
        @Override
        public void run(){
            do {
                i = r.nextInt();
                if (i>=0) {
                    if(i<6) System.out.println(colours[i]);
                }
            } while (i != 4);
        }
    });
    ob.start();
}
}