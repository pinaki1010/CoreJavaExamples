public class IfElseExample {
    public static void main(String[] args) {
        //IF-ELSE-IF Example
        System.out.println("IF-ELSE-IF EXAMPLE -->");

        int age = 30;

        if(age > 20 && age < 30){
            System.out.println("Adult");
        }else if(age == 20){
            System.out.println("your age is"+age);
        }else{
            System.out.println("you are mid year");
        }
    }
}
