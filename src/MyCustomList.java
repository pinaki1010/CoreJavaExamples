import java.util.ArrayList;
import java.util.List;


//Generic Class
public class MyCustomList<T> {
    //Generic Method

    static <X extends List> void duplicate(X list){
        list.addAll(list);
        System.out.println(list);
    }

    //Upper value Wild Cards

    static  double sumOFNumber(List<? extends Number > numbers){
        double sum = 0.0;
       for(Number number:numbers){
           sum += number.doubleValue();

       }
        System.out.println(sum);
       return sum;
    }

    //Lower Value Wild Cards (helps to take different type values

    static  void sumOFNumberwithLowerValue(List<? super Number > numbers){

        numbers.add(110);
        numbers.add(110l);
        numbers.add(110f);
        numbers.add(110.0);

        System.out.println(numbers);
    }


        ArrayList<T> arrayList = new ArrayList<>();




        public void addElement (T element){
            arrayList.add(element);
        }

        public void removeElement (T element){

            arrayList.remove(element);
        }

        @Override
        public String toString () {
            return arrayList.toString();
        }

        public T get ( int index){
            return arrayList.get(index);
        }

    public static void main(String[] args) {

        List emList = new ArrayList<Number>();
        sumOFNumberwithLowerValue(emList);
    }

}
