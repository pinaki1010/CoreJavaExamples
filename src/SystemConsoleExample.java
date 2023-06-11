import java.util.Scanner;

public class SystemConsoleExample {
    public static void main(String[] args) {
        //System Console
        try {
            String name = System.console().readLine("Hi what is your name-->");
            System.out.println("Hi "+name);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        //Scanner
        System.out.println("What is your Name---->");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("Hi --->"+name1);
    }
}
