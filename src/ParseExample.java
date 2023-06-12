import java.util.Scanner;

public class ParseExample {
    public static void main(String[] args) {

        //Integer Parse Int
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = sc.nextLine();
        System.out.println("Your Date of Year is-->"+(2023-Integer.parseInt(age)));
    }

}
