import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}
public class QueueExa {
    public static void main(String[] args) {
       // Queue<String> queue = new PriorityQueue<>(new StringLengthComp());
        Queue<String> queue = new PriorityQueue<>();
        //add method to insert
        queue.add("Pin");
        // offer method
        queue.offer("Naki");
        queue.offer("Nanda");
        //add ALL
        queue.addAll(List.of("Pinaki","Nandan","Hota","Mr"));
        System.out.println(queue);
        //DELETE Offer()
        queue.poll();
        System.out.println(queue);
        //Using Comparator Method
        Queue<String> queue1 = new PriorityQueue<>(new StringLengthComp());
        queue1.addAll(List.of("Pinaki","Nandan","Hota","Mr"));
        System.out.println(queue1);




    }

}
