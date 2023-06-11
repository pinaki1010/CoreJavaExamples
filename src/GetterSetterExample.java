public class GetterSetterExample {
    public static void main(String[] args) {

        //Getter-Setter Method

        ClassPojoBook classPojoBook = new ClassPojoBook();
        classPojoBook.setName("Math");
        classPojoBook.setPrice(1000);
        classPojoBook.setBookPageCount(10232);

        System.out.println("BookNAME--->"+classPojoBook.getName());
        System.out.println("BookPRICE--->"+classPojoBook.getPrice());
        System.out.println("BookPageCount--->"+classPojoBook.getBookPageCount());

        //Constructor Example

        //ClassPojoBook classPojoBook1 = new ClassPojoBook();
        ClassPojoBook classPojoBook2 = new ClassPojoBook("English",1002,10003);
        System.out.println("Name-->"+classPojoBook2.getName()+"\nBook Price-->"+classPojoBook2.getPrice()+"\nPage Count--->"+classPojoBook2.getBookPageCount());


    }
}
