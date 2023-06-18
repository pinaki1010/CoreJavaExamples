import java.util.ArrayList;
import java.util.List;

public class GenericRunnerEx {
    public static void main(String[] args) {

        MyCustomList<String> list = new MyCustomList();
        list.addElement("Pinaki");
        String value=list.get(0);

        System.out.println("Get value of index-->"+value);



        System.out.println(list);

        MyCustomList<Integer> list1 = new MyCustomList();
        list1.addElement(1);
        Integer a = list1.get(0);
        System.out.println("Get value of index-->"+a);
        System.out.println(list1);

        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1, 2, 3));
        MyCustomList.duplicate(arrayList1);
        MyCustomList.sumOFNumber(arrayList1);







    }
}
