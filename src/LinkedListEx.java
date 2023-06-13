import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
    public static void main(String[] args) {
        //Linked List Example
        LinkedList ls = new LinkedList<String>();
        ls.add("Pinaki");
        ls.add("Nandan");
        ls.add("Hota");

        System.out.println(ls);

        //Add First
        ls.addFirst("Mr.");
        System.out.println(ls);
        //Add Last
        ls.addLast("puri");
        System.out.println(ls);

        //Push
        ls.push("Pinaki");
        System.out.println("PUSH METHOD -->"+ls);

        //Remove
        ls.remove("Pinaki");//Remore first Occurance
        System.out.println("Remove Pinaki METHOD -->"+ls);
        //POP
        ls.pop();//Remove First Occurance
        System.out.println("POP Remove first like stack METHOD -->"+ls);
        //Offer like addLast
        ls.offer("Mr");
        System.out.println("Offer add Last METHOD -->"+ls);
        //Offer first Mthod
        ls.offerFirst("Hello");
        System.out.println("Offer add first METHOD -->"+ls);

        getMethodOfList(ls);
    }
    private static void getMethodOfList(LinkedList<String> ls){
        //get()
        System.out.println("ls.get()--->"+ls.get(0));
        //getFirst()
        System.out.println("getFirst()--->"+ls.getFirst());
        //getLast()
        System.out.println("getlast()--->"+ls.getLast());
        //peek
        System.out.println("Peek()--->"+ls.peek());
        //peekFirst
        System.out.println("PeekFirst()--->"+ls.peekFirst());
        //peekLast
        System.out.println("PeekLast()--->"+ls.peekLast());
        //List Iterator
        ListIterator<String> ls1 = ls.listIterator();
        while(ls1.hasNext()){
            System.out.println("Element using Iterator wise-->"+ls1.next()+"--->Index--->"+ls1.previousIndex());
        }
        //Iterator
        var it = ls.iterator();
        while(it.hasNext()){
            System.out.println("Element using Iterator wise-->"+it.next());
        }
    }
}
