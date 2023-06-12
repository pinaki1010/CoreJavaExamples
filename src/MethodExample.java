public class MethodExample {
    public static void main(String[] args) {
        int age = 50;
        String name = "Pinaki";
        boolean IsAdult = true;

        voteEligible(age,name,IsAdult);
        voteEligible("Jinu");

    }

   //Method Example
    public static void voteEligible(int age,String name,boolean IsAdult){
        if(age>=18){
            if(IsAdult){

                System.out.println("Hi "+name+",your are eligible");

            }
        } else{

            System.out.println("Hi"+name+",your are not eligible");
        }
    }
     //Method Overloading
        public static void voteEligible(String name){

                    System.out.println("Hi "+name+",your are eligible");

            }



}
