//Interface Example Human
interface Human{
    void eat();
    void drink();
    void sleep();

}

//Child class Implements Human
class Men implements Human{

    @Override
    public void eat() {
        System.out.println("Men Eating");
    }

    @Override
    public void drink() {
        System.out.println("Men Drinking");
    }

    @Override
    public void sleep() {

        System.out.println("Men Sleeping");

    }
}
//Child class Implements Human
class Women implements Human{

    @Override
    public void eat() {
        System.out.println("WoMen Eating");
    }

    @Override
    public void drink() {
        System.out.println("WoMen Drinking");
    }

    @Override
    public void sleep() {
        System.out.println("WoMen Sleeping");
    }
}




public class InterfaceExampleEx {
    public static void main(String[] args) {

        Men men=new Men();
        men.eat();
        men.drink();
        men.sleep();

        Human women = new Women();

        women.eat();
        women.drink();
        women.sleep();

        //By For Method Polymorphism
        System.out.println("Polymorphism Method Example ----->");
        Human human[] = {new Men(),new Women()};

        for(Human humanex:human){
            humanex.eat();
            humanex.drink();
            humanex.sleep();

        }


    }
}
