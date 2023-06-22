public class FinallyEx {
    public static void main(String[] args) {


        try {
            int number[] = {1, 2, 3};
            int i = number[4];
        }catch (Exception e){
            e.printStackTrace();
        }finally {//Last Finally Executed

            System.out.println("Finally Block Executed");
        }
    }
}
