package ss12_map.practice.hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap=new HashMap<>();
        hashmap.put("John", 30);
        hashmap.put("Bill", 35);
        hashmap.put("Denis", 21);
        hashmap.put("Irene", 28);

        System.out.println("Display all entries in HashMap");
        System.out.println(hashmap+"\n");

        Map<String, Integer> treeMap=new TreeMap<>(hashmap);
        System.out.println("Display all entries");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("John", 30);
        linkedHashMap.put("Bill", 35);
        linkedHashMap.put("Denis", 21);
        linkedHashMap.put("Irene", 28);
        System.out.println("The age of Denis is: "+ linkedHashMap.get("Denis"));
    }
}
