import java.util.Locale;

public class StringMethodEx {
    public static void main(String[] args) {
        printCheck("pINAKI");
        printCheck(" ");
        printCheck("  \t");

        //Index Of
        String name = "Pinaki";
        System.out.println("First Index of character p-->"+name.indexOf('p'));
        //First after index
        System.out.println("First Index of character i after 2-->"+name.indexOf('i',1));
        System.out.println("last index of character i--->"+name.lastIndexOf('i'));

        //String Comparison Methods

        String name1 = "Pinaki Nandan Hota";
        System.out.println(name1.toLowerCase());
        if(name1.equals(name1.toLowerCase())){
            System.out.println("EQUAL");
        }else {
            System.out.println("Not Equal");
        }

         //IgnoreCase
        if(name1.equalsIgnoreCase(name1.toLowerCase())){
            System.out.println("EQUAL");
        }else {
            System.out.println("Not Equal");
        }
        //StartsWith
        if(name1.startsWith("pinaki")){
            System.out.println("Starts with Pinaki");
        }else {
            System.out.println("Not Starts with Pinaki");
        }
        //Ends with
        if(name1.endsWith("Hota")){
            System.out.println("Ends WITH hota");
        }else {
            System.out.println("Not end with");
        }
        //Conatins
        if(name1.contentEquals(name1.toLowerCase())){
            System.out.println("EQUAL");
        }else {
            System.out.println("Not Equal");
        }

    }
    public static void printCheck(String check){

        //IS_EMPTY METHOD EXAMPLE
        if(check.isEmpty()){
            System.out.println("String is Empty");
        }
        //IS_BLANK EXAMPLE
        if(check.isBlank()){
            System.out.println("String is blank");

        }

        System.out.println("char at first-->"+check.charAt(0)+"   char at last-->"+check.charAt(check.length()-1));


    }
}
