import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsComaparableRunnerEx {
    public static void main(String[] args) {

        List<StudentsComparableEx> student = List.of(new StudentsComparableEx("Pinaki",1),
                new StudentsComparableEx("Sattwiki",3),
                new StudentsComparableEx("Priya",2)
        );

        List<StudentsComparableEx> studentList = new ArrayList<>(student);

        Collections.sort(studentList);

        System.out.println(studentList);



    }
}
