public class StringBuilderEx {
    public static void main(String[] args) {
        String name = "Hi Pinaki";
        StringBuilder sb = new StringBuilder("Hi Pinaki");
        //concat to check mutable
        name.concat("  How are you?");//For String Concat Not worked as its immutable create two object for two strings
        sb.append("  How are you?");

        printInfomation(name);
        System.out.println("String Builder");
        printInfomation(sb.toString());

    }
    public static void printInfomation(String name){

        System.out.println("Length of String ---->"+name.length());
        System.out.println("String name--->"+name);

    }
}
