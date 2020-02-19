package Exercise2;
 interface  test{
     public void StressTest(boolean StressValue);
     public void FireTest(boolean Temp);
 }
 class Furniture{
     class wooden{
         class chair implements test{

             @Override
             public void StressTest(boolean StressValue) {
                 System.out.println("StressTest Result"+StressValue);
             }

             @Override
             public void FireTest(boolean Temp) {
                 System.out.println("Firetest Result"+Temp);
             }
         }
         class table implements test{

             @Override
             public void StressTest(boolean StressValue) {
                 System.out.println("StressTest Result"+StressValue);
             }

             @Override
             public void FireTest(boolean Temp) {
                 System.out.println("Firetest Result"+Temp);
             }
         }
     }
     class Metal{
         class chair implements test{

             @Override
             public void StressTest(boolean StressValue) {
                 System.out.println("StressTest Result"+StressValue);
             }

             @Override
             public void FireTest(boolean Temp) {
                 System.out.println("Firetest Result"+Temp);
             }
         }
         class table implements test{

             @Override
             public void StressTest(boolean StressValue) {
                 System.out.println("StressTest Result"+StressValue);
             }

             @Override
             public void FireTest(boolean Temp) {
                 System.out.println("Firetest Result"+Temp);
             }
         }
     }
 }
public class Question9 extends Furniture {
    public static void main(String[] args) {

        Furniture f= new Furniture();
        Furniture.wooden w=f.new wooden();
        wooden.chair wc=w.new chair();
        wooden.table wt=w.new table();
        System.out.println("Data for wooden chair and table------------------------------->");
        wc.FireTest(true);
        wc.StressTest(false);
        wt.FireTest(false);
        wt.StressTest(false);
        System.out.println("Data for metal chair and table-------------------------------->");
        Furniture.Metal m=f.new Metal();
        Metal.chair mc=m.new chair();
        Metal.table mt=m.new table();
        mc.FireTest(false);
        mc.StressTest(true);
        mt.FireTest(true);
        mt.StressTest(true);
    }
}
