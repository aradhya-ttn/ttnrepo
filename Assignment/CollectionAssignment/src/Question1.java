import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
    public static void main(String[] args) {
        float sum=0.0f;
        ArrayList<Float> arrayList =new ArrayList<Float>();
        arrayList.add(24.23f);
        arrayList.add(123.32f);
        arrayList.add(32.12f);
        arrayList.add(15.23f);
        arrayList.add(10.5f);
        Iterator<Float> it =arrayList.iterator();
        while(it.hasNext()){
            sum+=it.next();

        }
        System.out.println("total sum is :"+sum);
    }
}
