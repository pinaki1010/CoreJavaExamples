public class SwitchJavaExample {
    public static void main(String[] args) {
        int age = 50;
        //Traditional Switch Statement
        switch(age){
            case 20:
                System.out.println("Your age is "+age);
                break;
            case 30:
                System.out.println("Your age is "+age);
                break;
            case 50:
                System.out.println("Your age is "+age);
                break;

            default:
                System.out.println("Your are out of age");
                break;
        }

        //Modern Switch Statement

        switch(age){
        case 20-> System.out.println(age);
        case 50-> System.out.println(age);
        default ->System.out.println(age);

        }


    }
}
