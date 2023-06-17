import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExampleEx {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple","Banana","Orange");
        System.out.println(set);
        //After Declaring Set we can't add element
       // set.add("Grapes");
       //Set arent Unique Element
//        Set<String> set1 = Set.of("Apple","Banana","Orange","Orange");
//        System.out.println(set1);
        //Using Hashset we can add element and we cant add element in position
        //On odered Element

        Set<String> hashset = new HashSet<>(set);
        hashset.add("Grapes");
        System.out.println(hashset);

        //LinkedHasset stored element in which they are inserted
        Set<String> hashset1 = new LinkedHashSet<>();
        hashset1.add("Grapes");
        hashset1.add("Banana");
        hashset1.add("Apple");
        hashset1.add("Orange");

        System.out.println(hashset1);


    }
}
