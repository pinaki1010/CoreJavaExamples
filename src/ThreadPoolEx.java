import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;
    public Task(int number){
        this.number=number;
    }
    public void run(){
        System.out.print("\nTask "+number+ "Started");

        for(int i=number*100;i<=number*100+99;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask"+number+"Done");

    }
}

public class ThreadPoolEx {
    public static void main(String[] args) {
        //Fixed thread pool provide n number of thread run at a time in parallel
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new Task(1));
        service.execute(new Task(2));
        //Here it first 1 and 2 after 1,2 completed it will run 3and 4 as we provide pool size to 2, so it will run 2 at a time
        service.execute(new Task(3));
        service.execute(new Task(4));
        service.shutdown();

    }
}
