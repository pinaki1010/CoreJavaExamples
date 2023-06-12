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
        //String Builder CAPACITY
        System.out.println(sb.capacity());
        StringBuilder sb1= new StringBuilder(50);//CAPACITY iINCREASES
        System.out.println(sb1.capacity());
        //DeleteCharAt
        sb.deleteCharAt(5).insert(5,"P");
        printInfomation(sb.toString());
        //Replace Method
        sb.replace(0,5,"Sattwiki");
        printInfomation(sb.toString());
        //Reverse Method
        sb.reverse().setLength(12);//Reverse Method and Trim to be String till 7 index
        printInfomation(sb.toString());
    }
    public static void printInfomation(String name){

        System.out.println("Length of String ---->"+name.length());
        System.out.println("String name--->"+name);


    }
}
