import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList Example
        //Declaration
        ArrayList<Integer> arr = new ArrayList<>();
        //Add Method
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);
        //Get Method
        System.out.println(arr.get(1));

        //using for
        for(int i=0;i<arr.size();i++){

            System.out.println(arr.get(i));
        }
        //Add All

      arr.addAll(Arrays.asList(1,2,3,4));
        System.out.println("after add all-->"+arr);

        //remove
        arr.remove(1);
        System.out.println(arr);
        //index replacement
        arr.add(1,5);
        System.out.println(arr);
        //Sort
        arr.sort(Comparator.reverseOrder());
        System.out.println("after reverse sorting--->"+arr);
        //Sort
        Collections.sort(arr);
        System.out.println("after sorting--->"+arr);
        //clear
        arr.clear();
        System.out.println("after sorting--->"+arr);
        System.out.println(arr.isEmpty());



    }
}
