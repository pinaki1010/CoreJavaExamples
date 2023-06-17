import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        //Map Example
        Map<Integer,String> map = Map.of(1,"Pinaki",2,"Nandan",3,"Hota");

        //Method
        //get
        System.out.println(map.get(1));
      //isEmpty()
        System.out.println(map.isEmpty());
        //ContainsKey()
        System.out.println(map.containsKey(1));
        //ContainsVales()
        System.out.println(map.containsValue("Pinaki"));
        //keySet()
        System.out.println(map.keySet());
        //Values
        System.out.println(map.values());
        //put//As Map immutable not allowed to add element for that we need hashMap
//        map.put(4,"Krishna");
//        System.out.println(map);
        //By using HashMap we cann add element //un ordered
        Map<Integer,String> hashmap = new HashMap<>(map);
        hashmap.put(4,"Krishna");
        System.out.println("HashMap---->"+hashmap);
        //Using LinkedHashMap and Insertion order
        LinkedHashMap<Integer,String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put(1,"p");
        hashmap1.put(2,"i");
        hashmap1.put(4,"n");
        hashmap1.put(3,"p");
        System.out.println("LinkedHashMap---->"+hashmap1);
        //TreeMap Sorted order
       TreeMap<Integer,String> treemap = new TreeMap<>();
       treemap.put(1,"p");
       treemap.put(2,"i");
        treemap.put(4,"n");
        treemap.put(3,"p");
        System.out.println("TreeMap---->"+treemap);



    }
}
