import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        //Concurrent Map
        //Long Adder Concurrent Map
        ConcurrentMap<Character, LongAdder> ocConcurrentMap = new ConcurrentHashMap<>();

        String str ="Pinaki Nandan Hota";
        //ConcurrentMap make thread Safe
        for(char ch:str.toCharArray()){
            ocConcurrentMap.computeIfAbsent(ch, ch1 ->new LongAdder()).increment();

        }
        System.out.println(ocConcurrentMap);
    }
}
