import java.util.Scanner;

class CustomExceptionForNull extends Exception{
    public CustomExceptionForNull(String message) {
        super(message);
    }
}

public class CustomExceptionEx {
    public static void main(String[] args) throws Exception {
        String name=null;
        method3(name);

       Java7newFuture();

    }

    private static void Java7newFuture() {
//After Java 7 we can directly use action in try block it automatically handled connection close Method
        try(Scanner sc = new Scanner(System.in)){

        }
    }

    private static void method3(String name) throws Exception {
        if(name==null){
            throw new CustomExceptionForNull("You have entered Null Value");//when you are throwing checked expression it must be handled in calling and definitions
        }
    }
}
