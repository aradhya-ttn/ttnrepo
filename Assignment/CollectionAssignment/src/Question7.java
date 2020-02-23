import java.util.*;

public class Question7  {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(1);

        LinkedHashMap<Integer,Integer> linkedHashMap= new LinkedHashMap<>();
        for (int i = list.size()-1; i >-1 ; i--) {
            linkedHashMap.put( Collections.frequency(list,list.get(i)),list.get(i));
        }
        Map<Integer, Integer> reverseSortedMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        reverseSortedMap.putAll(linkedHashMap);
        for (Map.Entry<Integer, Integer> entry : reverseSortedMap.entrySet()) {
            System.out.println(" number :" +entry.getValue()+" frequency :"+entry.getKey());
        }


    }


}
