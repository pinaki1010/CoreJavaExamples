class Task1 extends Thread{

    public void run(){

        for(int i=0;i<10;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-1-Done");
    }

}



public class MultiThreadingExample {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.start();//Thread to Start

        for(int i=10;i<20;i++){
            System.out.print(" "+i);
        }
        System.out.println("Task-2-Done");


    }
}
