import java.util.concurrent.atomic.AtomicInteger;

public class AtomicConcurrencyEx {
    //inbuilt lock and unlock method
    AtomicInteger i= new AtomicInteger();
    AtomicInteger j=new AtomicInteger();


    public AtomicInteger getI() {

        return i;

    }

    public AtomicInteger getJ() {
        return j;
    }

    //In synchronized method one  method run at a time

    synchronized public void incrementI(){

       i.incrementAndGet();


    }

    synchronized public void incrementJ(){
     j.incrementAndGet();
    }

}
