public class StudentsComparableEx implements Comparable<StudentsComparableEx>{

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
 public StudentsComparableEx(){

 }

    public StudentsComparableEx(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    //By creating compareTo we can sort custom model sort by integer comparing
    //for reverse order only change (that.roll,this.roll)

    @Override
    public int compareTo(StudentsComparableEx that) {
        return Integer.compare(this.roll,that.roll);
    }
}
