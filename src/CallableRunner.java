import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    private String name;

    public CallableTask(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello-->" + name;
    }
}





public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //executorService.submit to call callable Service
        //Future implements executor which provides call back promise in future time

        Future<String> futureString = executorService.submit(new CallableTask("Pinaki"));
        System.out.println("new CallableTask(Pinaki) Executed");

        System.out.println("Message we get after calling Callable Task"+futureString.get());

        System.out.println("Main method Executed");

        executorService.shutdown();


    }
}
