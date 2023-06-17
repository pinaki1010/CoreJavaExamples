import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet sorting order
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(500);
        set.add(65);
        set.add(95);
        set.add(100);
        System.out.println(set);
        //Method
        //means <= less than equal to
        System.out.println("floor+--->"+set.floor(65));
        //means <less than
        System.out.println("lower--->"+set.lower(65));
        //means >= greater than equal to
        System.out.println("ceiling+--->"+set.ceiling(65));
        //means > greater than
        System.out.println("higher--->"+set.higher(65));
        //Subset//lower is inclusive and upper is exclusive
        System.out.println("subset between 65 to 100--->"+set.subSet(65,100));

    }
}
