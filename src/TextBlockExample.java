public class TextBlockExample {
    public static void main(String[] args) {
        String name = """
                Hi I am Pinaki
                "Nandan"<html>
                </html> 
                Hota
                """;
     //Format Specification printf
        int age = 35;
        System.out.printf("%.2f%n",(float) age);

        //Format Specification using String.Format
        String age1 = String.format("Your age is %d%n",age);
        System.out.println("Your age is using String format"+age1);


        //Format Specification using "".formatted
        String age2 = "Your age is %d".formatted(age);
        System.out.println("Your age is using String format"+age2);

        System.out.println(name);
    }
}
