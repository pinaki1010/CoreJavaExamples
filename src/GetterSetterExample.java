public class GetterSetterExample {
    public static void main(String[] args) {
        //Getter-Setter
        ClassPojoBook classPojoBook = new ClassPojoBook();
        classPojoBook.setName("Math");
        classPojoBook.setPrice(1000);
        classPojoBook.setBookPageCount(10232);

        System.out.println("BookNAME--->"+classPojoBook.getName());
        System.out.println("BookPRICE--->"+classPojoBook.getPrice());
        System.out.println("BookPageCount--->"+classPojoBook.getBookPageCount());

    }
}
