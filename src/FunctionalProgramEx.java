import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramEx {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Orange","Manana");
        System.out.println("printBasic---------->");
        printBasic(list);

        System.out.println("printAdvance---------->");
        printWithFP(list);
        System.out.println("PrintWithFilter---------->");
        printWithFPWithFiltter(list);
        List<Integer> list1  = List.of(1,4,5,6,7,6);
        printWithFPWithReducePrint(list1);

        //Intermediate Operation
        //Sorted
        list1.stream().sorted().forEach(e-> System.out.print(" "+e));
        System.out.println("\nDistinct Element Sorted Order-->");
        //distinct
        list1.stream().distinct().sorted().forEach(element-> System.out.print(" "+element));
        //Map
        System.out.println("\nSquare of Element using map-->");
        list1.stream().distinct().map(e->e*e).forEach(e-> System.out.println(e));

        //Exercise
        //print square of 1 to 10 using inStream()
        IntStream.range(1,11).map(e->e*e).forEach(e-> System.out.print(" "+e));
        //list to lower case using Map
        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.print(" "+e));
        //length of element using map
        System.out.println("\nLength of Element using map-->");
        list.stream().map(e->e.length()).forEach(e-> System.out.print(" "+e));

        //Terminal Operation

       int max= list1.stream().max((a,b)-> Integer.compare(a,b)).get();
        System.out.println("\n Max Number"+max);

       //min

        int min= list1.stream().min((a,b)-> Integer.compare(a,b)).get();
        System.out.println("\n Max Number-->"+min);

        //odd number
        System.out.print("odd-number-->");
        list1.stream().filter(e->e%2==1).forEach(e-> System.out.print(" "+e));

        //Collectors
        System.out.print("\n List Element-->");
        List<Integer> listInt = list1.stream().filter(e->e%2==1).collect(Collectors.toList());

        System.out.println(""+listInt);

        //BOX
        System.out.println(IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList()));

        //orElse

        System.out.println(list1.stream().filter(e->e%2==1).max((a,b)->Integer.compare(a,b)).orElse(0));

        //behind the scence filter->predicate->test
        //behind the scence foreach->consumer->accept
       //map->function->apply
    }
    private static void printBasic(List<String> list){
        for(String string:list){
            System.out.println(string);
        }


    }
    //Stream Using
    private static void printWithFP(List<String> list){
        list.stream().forEach(
                e-> System.out.println(e)
        );


    }
    //Fillter Using
    private static void printWithFPWithFiltter(List<String> list){
        list.stream()
                .filter(e->e.endsWith("nana"))
                .forEach(
                e-> System.out.println(e)
        );


    }

    //Reduce Using
    private static void printWithFPWithReducePrint(List<Integer> list1){
        int sum=list1.stream().reduce(0,(a,b)->{

            System.out.println("Sum-> "+a+" number-->"+b);

            return a+b;});
        System.out.println(sum);


    }
}
