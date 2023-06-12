import java.util.Collections;
import java.util.List;
import java.util.Map;

public class StudentInheritanceEx {
    private String name;
    private int roll;
    private String className;

    public String getName(){
        return name;

    }
    public String getClassName(){
        return className;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setClassName(String className){
        this.className= className;

    }
    public StudentInheritanceEx(String name,int roll,String className){

        this.name=name;
        this.className=className;
        this.roll=roll;
    }

    public StudentInheritanceEx(){

    }

   public void getStudentNameBelow10Roll(Map<Integer,String> stdlist ){
        stdlist.entrySet().stream().forEach(e->{
            if(e.getKey() <= 10){
                System.out.println("Name-->"+e.getValue()+"Roll-->"+e.getKey());
            }
        });
   }
   public void getStudentName(){
        System.out.println("Hi I am At Student Class");
   }
}
