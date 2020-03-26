package Exercise2;

public class Question6 {
    public static void main(String[] args) {
        int a=45,b=0;
       try{
           int c= a/b;
       }catch (ArithmeticException ae){
           ae.printStackTrace();
       }catch (NumberFormatException nfe) {
           nfe.printStackTrace();
       }
       catch (Exception e){
           e.printStackTrace();
       }
       finally {
           System.out.println("this is a finally bliock");
       }
    }
}
