class Task1 extends Thread{

    public void run(){
        System.out.println("Task-1-Started");
        for(int i=0;i<10;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-1-Done");
    }

}
class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Task-2-Started");
        for(int i=30;i<40;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-2-Done");
    }
}



public class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException {

        Task1 task1 = new Task1();
        task1.yield();//Yield give another thread to perform if other higher priority waiting
        task1.start();//Thread to Start
        //For priority giving (request to do ) min-=1,normal=2,max =10
        task1.setPriority(1);//Min priority



        Task2 task2 = new Task2();//For Implements Runnable we must create object of Thread
        Thread thread = new Thread(task2);
        thread.setPriority(10);//Max priority
        thread.sleep(1000);//thread stop execution for this seconds
        thread.run();

        //Task start after task1 and task 2 started
        task1.join();
        thread.join();


        System.out.println("Task-3-Started");
        for(int i=10;i<20;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-3-Done");


        //Thread Life Cycle
        //NEW->RUNNABLE(Ready to Run)->RUNNING->BLOCKED/WAITING(Calling External API waiting for response Back)->TERMINATE/DEAD
        //When Task2 is Running to print its runnable state but print of current is on running state

        //Different types of thread method
        //Synchronized wait other threads to stop and run on priority



    }
}
