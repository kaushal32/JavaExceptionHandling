public class Exception_propagation {
    void m(){
        int data=20/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Exception_propagation obj=new Exception_propagation();
        obj.p();
        System.out.println("normal flow");
    }

}
