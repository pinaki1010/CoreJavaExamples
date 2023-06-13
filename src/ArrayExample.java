import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {
        //Array Example
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(Arrays.toString(arr));
        //Array dynamic allocation directly assign value
        int []arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        //ArrayMethod
        //Sort
        int []arr2 = {11,21,62,42,5};
        System.out.println("Before Sort---->"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After Sort---->"+Arrays.toString(arr2));
        //Fill
        int arr3[] = new int[10];
        Arrays.fill(arr3,501);
        System.out.println("After filling 10 in Array-->"+Arrays.toString(arr3));
        //copy
        int[] smallArray = Arrays.copyOf(arr3,5);
        System.out.println(Arrays.toString(smallArray));
        //copy if take larger then it fill 0000
        int []largerArray = Arrays.copyOf(arr3,20);
        System.out.println(Arrays.toString(largerArray));

        //Binary Search Apply after search , No duplicate value, comparable

        String []nameArray = {"Pinaki","Nandan","Hota","Sattwiki"};
        Arrays.sort(nameArray);//First Sort then search
        if(Arrays.binarySearch(nameArray,"Pinaki")>=0){
            System.out.println("Pinaki Found");
        }else{
            System.out.println("Not Found");
        }
       //equals
        String[] p = {"PINAKI","NANDAN","HOTA"};
        String[] q = {"PINAKI","NANDAN","HOTA"};
        if(Arrays.equals(p,q)){
            System.out.println("equal Found");
        }else{
            System.out.println("Not Found");
        }

        StringVarArgs(p);



    }
    public static void StringVarArgs(String... args){//here I have used ... instead of Array
        System.out.println(Arrays.toString(args));
    }
}
