import java.util.*;

public class hash_ex {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); // Creating HashMap

        map.put(1, "gowtham");
        map.put(2, "nik");
        map.put(3, "saro");
        map.put(1, "jini");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}