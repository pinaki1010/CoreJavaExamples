public class ClassPojoBook {
    private String name;
    private int price;
    private int bookPageCount;

    public ClassPojoBook(){
        System.out.println("Default Constructor Called");

    }
    public ClassPojoBook(String name,int price,int bookPageCount){
        System.out.println("Parameterize Constructor Called");
        this.name=name;
        this.price=price;
        this.bookPageCount=bookPageCount;

    }

    public String getName(){
       return name;

    }
    public int getPrice(){
        return price;
    }
    public int getBookPageCount(){
        return bookPageCount;

    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setBookPageCount(int bookPageCount){
        this.bookPageCount=bookPageCount;
    }
}
