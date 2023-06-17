import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {

        //Array List Define
        List<String> listOfAnimal = List.of("CAT","DOG","SNAKE","LION");

        List<String> arr = new ArrayList<String> (listOfAnimal);

        //Iterator Example//For deletion of element best to go with iterator
        Iterator it = arr.listIterator();

        while(it.hasNext()){

            System.out.println(it.next());

        }
        //After Sort
        Collections.sort(arr);

        System.out.println(arr);


    }
}
