import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyEx {
    int i=0;
    int j=0;
    Lock lockI = new ReentrantLock();
    Lock lockj = new ReentrantLock();

    public int getI() {

        return i;

    }

    public int getJ() {
        return j;
    }

    //In synchronized method one  method run at a time

    synchronized public void incrementI(){
        //Get Lock
        //lock method check any if lock method is there or not then it releases after check any lock release
        lockI.lock();
       i++;
       //Release Lock
        lockI.unlock();
    }

    synchronized public void incrementJ(){
        //Get Lock
        lockj.lock();
        j++;
        //Release Lock
        lockj.unlock();
    }

}
