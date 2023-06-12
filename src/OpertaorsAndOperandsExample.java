public class OpertaorsAndOperandsExample {

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
            System.out.println("number is not right ");

        }

        //Ternary Operators
        System.out.println("Ternary Example--->");
         int age = 15;
        boolean isAdult = (age>=18)?true:false;
        System.out.println("Age is adult  "+isAdult);

        //Example Using Everything
        System.out.println("All Example--->");
        double a = 20.00;
        double b = 80.00;
        double c = a + b * 100.0;
        double r = c % 40.00;
        boolean res = r == 0.00 ? true:false;
        System.out.println(res);
        if(!res){
            System.out.println("Got some remainder ");

        }




    }
}
