import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String Str = sc.nextLine();
        char[] ch = Str.toCharArray();
        System.out.println(uniqueCount(ch));
    }

    public static int uniqueCount(char[] c) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        int countUnique = 0;
        for (char ch : c) {
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
        }
        for (Character k : hashmap.keySet()) {
            countUnique += hashmap.get(k)==1 ? 1: 0;
        }
        return countUnique;
    }
}