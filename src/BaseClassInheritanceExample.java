import java.util.HashMap;
import java.util.Map;

public class BaseClassInheritanceExample extends StudentInheritanceEx{
    public static void main(String[] args) {
        //Inheritance Example
        StudentInheritanceEx bs = new StudentInheritanceEx("Pinaki",1,"A1");
        StudentInheritanceEx bs1 = new StudentInheritanceEx("Sattwiki",2,"B3");
        StudentInheritanceEx bs3 = new StudentInheritanceEx("Sattwiki1",21,"B1");

        StudentInheritanceEx bs4 = new StudentInheritanceEx("Sattwiki12",10,"B12");

        BaseClassInheritanceExample bl = new BaseClassInheritanceExample();
        HashMap<Integer,String> map = new HashMap<Integer, String>() {
        } ;
        map.put(bs.getRoll(),bs.getClassName());
        map.put(bs1.getRoll(),bs1.getClassName());
        map.put(bs3.getRoll(),bs3.getClassName());
        map.put(bs4.getRoll(),bs4.getClassName());

        bl.getStudentNameBelow10Roll(map);



    }
}
