package MapTypesTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();

        linkedHashMap.put("Olzhas", "Hello");
        linkedHashMap.put("Arman", "Business");
        linkedHashMap.put("Google", "HDSs");

        System.out.println(linkedHashMap);
    }
}