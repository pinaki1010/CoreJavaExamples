public class StringMethods {
    public static void main(String[] args) {
        String m = "Pinaki NANDAN HOTA";
        //SubString
        System.out.println(m.substring(6));
        System.out.println(m.substring(6,10));//start,end
        //Concat
        System.out.println(m.concat("-MCA"));
        //Join(firstwhichto join between sentence,strings)
        String joinm = m.join("-","M.TECH","Pinaki","Nandan","Hota");
        System.out.println(joinm);
        //Replace(OLDCHAR,NEWCHAR)
        System.out.println(m.replace(" ","-"));
        //Replace first
        System.out.println(m.replaceFirst(" ","-"));
        //Replace All
        System.out.println(m.replaceAll("i ","-"));
        //Repeat
        System.out.println(m.repeat(5));
        System.out.println("Pinaki\n".repeat(4));
        //Repeat_Indent
        System.out.println(m.repeat(5).indent(8));//8 White Space right
        System.out.println("              Pinaki\n".repeat(4));
        System.out.println("              Pinaki\n".repeat(4).indent(-4));//It will remove white space from left

    }
}
