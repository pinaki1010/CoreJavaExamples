public class MethodOverLoadingEx extends StudentInheritanceEx{
    public static void main(String[] args) {

        StudentInheritanceEx methodOverLoadingEx = new MethodOverLoadingEx();
        //Method overriding Its called Parent class method
        methodOverLoadingEx.getStudentName();
        MethodOverLoadingEx methodOverLoadingEx1 = new MethodOverLoadingEx();

        methodOverLoadingEx1.getStudentName(" Pinaki");

    }


    public void getStudentName(){
        System.out.println("I am At MethodOverloading class");
    }

    public void getStudentName(String name){
        System.out.println("I am At MethodOverloading class"+name);
    }
}
