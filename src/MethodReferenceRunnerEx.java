import java.util.List;

public class MethodReferenceRunnerEx {
    public static void main(String[] args) {
        List<String> list = List.of("Pinaki","Nandan","Hota");

        list.stream().filter(e->e.length()>4&&e.length()<7).forEach(e->
                System.out.print(e+" "));

        //After applying method refernce
        //In here static print method called
        System.out.println("\nAfter applying Static Method Reference--->");
        list.stream().filter(e->e.length()>4&&e.length()<7).forEach(
                System.out::print);

        //In here Instance length method called
        System.out.println("\nAfter applying Instance Method Reference--->");
        list.stream().filter(MethodReferenceRunnerEx::checkLength).forEach(
                System.out::print);
    }
    //Static Method creates for Method Reference
    public static boolean checkLength(String e){

        if(e.length()>4&&e.length()<7){
            return true;
        }else{
            return false;
        }

    }
}
