import java.util.Comparator;

public class StudentsComparatorEx implements Comparator<StudentsComparableEx> {

    private String name;
    private int roll;


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentsComparableEx{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
 public StudentsComparatorEx(){

 }

    public StudentsComparatorEx(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }



    @Override
    public int compare(StudentsComparableEx o1, StudentsComparableEx o2) {
        return 0;
    }

    //By creating compare we can compare two object



}
