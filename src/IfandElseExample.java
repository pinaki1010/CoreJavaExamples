public class IfandElseExample {

    public static void main(String[] args) {
        boolean isCreated = true;

        //IF-ELSE BLOCK
        System.out.println("If else Example--->");
        if(isCreated == false){
            System.out.println("Hi I am False");
        }else{
            System.out.println("Hi I am True");
        }

        //LOGICAL AND &&
        System.out.println("Logical And Example--->");
        int number = 50;

        if(number >= 50 && number > 80){
            System.out.println("number is right");
        }else{
            System.out.println("number is not ok ");

        }

        //LOGICAL OR ||
        System.out.println("Logical And Example--->");
        int number1 = 50;

        if(number >= 50 || number < 80){
            System.out.println("number is right");
        }else{
            System.out.println("number is not ok ");

        }


    }
}
