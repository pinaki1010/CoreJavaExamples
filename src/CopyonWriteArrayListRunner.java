import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListRunner {
    public static void main(String[] args) {
        //CopyOnWriteArrayList what basically doing it mostly woking on add list at the time add in parallel it performing get operation

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Pinaki");
        list.add("Nandan");
        list.add("Hota");

        for(String e:list){
            System.out.println(e);
        }
    }
}

