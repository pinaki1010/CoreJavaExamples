import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String > treeMap = new TreeMap<>();
        treeMap.put(1,"Pinaki");
        treeMap.put(2,"Nandan");
        treeMap.put(3,"Hota");

        //Tree Map Higher key > greater than key
        System.out.println(treeMap.higherKey(2));
        //Tree Map Lower key < less than key
        System.out.println(treeMap.lowerKey(3));
        //Tree Map cieling >= value
        System.out.println(treeMap.ceilingKey(1));
        //Tree Map floor <= value
        System.out.println(treeMap.floorKey(2));
        //Tree Map First Entry
        System.out.println(treeMap.firstEntry());
        //Tree Map Last Entry
        System.out.println(treeMap.lastEntry());
        //Sub MAp start-inclusive , end -exclusive
        System.out.println(treeMap.subMap(1,5));

    }
}
