import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String Str = sc.nextLine();
        char[] ch = Str.toCharArray();
        uniqueCount(ch);
    }

    public static void uniqueCount(char[] c) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        int countUnique = 0;
        for (char ch : c) {
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer>Entry : hashmap.entrySet()) {
            System.out.println(Entry.getKey()+" :"+Entry.getValue());

        }
    }
}
