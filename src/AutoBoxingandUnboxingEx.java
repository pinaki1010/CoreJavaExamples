public class AutoBoxingandUnboxingEx {
    public static void main(String[] args) {
        //Autoboxing Example

        Integer a = 15;//Wrapper Class
        int b = a;//Automatically Assigning to primitive type
        System.out.println("Automatically--->"+b);

        //UnBoxing Mnaullay
        Integer a1 = 18;
        int b1 = Integer.valueOf(a1);
        System.out.println("Manually using value of--->"+b1);

    }
}
