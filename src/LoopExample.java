public class LoopExample {
    public static void main(String[] args) {
        int m = 5;
        //For Loop
        for(int i=0;i<=m;i++){
            System.out.println(i);
        }
        //While loop
        while(m>0){
            System.out.println("Inside while");
            System.out.println(m);
            m--;

        }

        //do-while
        do{
            System.out.println("Inside do-while");
            System.out.println(m);
            m--;
        }while(m>0);



    }
}
