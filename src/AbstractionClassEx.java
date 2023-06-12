//Abstract class Example
//Walk method automatically public abstarct


abstract class Animal{
    int age = 10;
   public abstract void walk();
}
class cow extends Animal{
    public void walk(){
        System.out.println("Walikng By 4 legs");
    }
}
class chiken extends Animal{
    public void walk(){
        System.out.println("Walikng By 2 legs");
    }
}


public class AbstractionClassEx {
    public static void main(String[] args) {
            chiken ch = new chiken();
           int age = ch.age;
           ch.age=30;//As its public static final it act as constant
        System.out.println("age--->"+age);
            ch.walk();
            cow c = new cow();
            c.walk();
    }
}
