public class ExceptionHandlerRunner {
    public static void main(String[] args) {

        System.out.println("Main Method");
        method1();

    }
    private static void method1(){

        method2();//if exception not handled then after that calling nothing executed
        System.out.println("At method-1");
    }

    private static void method2() {
        try{
//        String str = null;
//        str.length();
        int number[]={1,2,3};
        int i=number[4];
        System.out.println("Method-2");
        }catch (NullPointerException e){//Null Pointer Exception Handled
            System.out.println("Null Pointer Exceptions");
        }catch (ArrayIndexOutOfBoundsException e){//Null Pointer Exception Handled
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
