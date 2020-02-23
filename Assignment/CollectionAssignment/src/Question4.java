import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"aradhya ");
        hashMap.put(10,"aman ");
        hashMap.put(4,"vinay ");
        hashMap.put(8,"ankit ");
        hashMap.put(3,"taman ");
        hashMap.put(6,"priyanka ");
        hashMap.put(2,"parul ");
        Set<Map.Entry<Integer, String>> set= hashMap.entrySet();
        List<Map.Entry<Integer,String>> list= new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> t1, Map.Entry<Integer, String> t2) {
                return (t1.getValue()).compareTo(t2.getValue());
            }
        });
        for (Map.Entry<Integer, String> entry :list) {

            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
    }

}
