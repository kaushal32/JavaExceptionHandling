//public class MultiCatchBlock {
//    public static void main(String[] args) {
//        try{
////            int a[]=new int[5];
////            System.out.println(a[10]);
////            a[5]=30/0;
//            String s=null;
//            System.out.println(s.length());
//        }catch (ArithmeticException e){
//            System.out.println("Arthmetic Exception occurs");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index Out of Bounds Exception");
//        }
//        catch(Exception e){
//            System.out.println("Parent Exception occurs");
//        }
//        System.out.println("Rest of the code");
//
//    }
//}

public class MultiCatchBlock {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(Exception e){
            System.out.println("common task completed");
        }
        System.out.println("rest of the code");
    }
}
