import java.util.*;

public class compareTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        
        boolean isEqual = java.util.Arrays.equals(arr1,arr2);

        if(isEqual){
            System.out.println("both arrays are equal");
        }
        else
            System.out.println("both arrays are not equal");

        


        sc.close();
    }
}
