public class CheckedExceptionEx {
    public static void main(String[] args) throws Exception {
        try {
            method1();
            Thread.sleep(10999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method2();
      //  method1(); for every time calling method must be handled as its checked exception
        //but for method 2 as its run time exception it doesn't require handled
        String name=null;
        method3(name);
    }

    private static void method3(String name) throws Exception {
        if(name==null){
            throw new Exception("You have entered Null Value");//when you are throwing checked expression it must be handled in calling and definitions
        }
    }

    private static void method2() throws RuntimeException{

    }

    private static void method1() throws InterruptedException {//As InterruptException is checked Exception it must handled

        Thread.sleep(1000);
    }
}
