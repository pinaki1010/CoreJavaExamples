import java.util.List;
import java.util.concurrent.*;

class Callable_Multiple_Task implements Callable<String> {

    private String name;

    public Callable_Multiple_Task(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello-->" + name;
    }
}

public class MultipleCallableRunnerEx {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //executorService.submit to call callable Service
        //Future implements executor which provides call back promise in future time
        //Create Multiple Runnable Tasks
        List<Callable_Multiple_Task> tasks = List.of(new Callable_Multiple_Task("Pinaki"),new Callable_Multiple_Task("Sattwiki"),new Callable_Multiple_Task("Priya"));
        //Assign Multiple tasks to future variable to get the call back
        List<Future<String>> results = executorService
                .invokeAll(tasks);
        for(Future<String> result :results){
            System.out.println(result.get());
        }

        //invokeAny provide one result from multiple callable task one at a time
        List<Callable_Multiple_Task> tasks1 = List.of(new Callable_Multiple_Task("Pinaki"),new Callable_Multiple_Task("Sattwiki"),new Callable_Multiple_Task("Priya"));
        //Assign Multiple tasks to future variable to get the call back single result at time
        String single_random_results = executorService.invokeAny(tasks1);

        System.out.println("Single Result-->"+single_random_results);
        executorService.shutdown();


    }
}
