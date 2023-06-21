import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //executor service provides scheduler where one thread run after one thread after task1 then run task2
        executorService.execute(new Task1());
        executorService.execute(new Task2());
        //if executor running one service after completing that service it will run after that second
        //meanwhile main can execute other method
        executorService.shutdown();//by using this method we can shut down executor running method
        System.out.println("Task-3-Started");
        for(int i=10;i<20;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-3-Done");


    }
}
