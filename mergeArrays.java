import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        int [] arr2=new int[size];
        System.out.println("Enter elements for arr1: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Enter elements for arr2: ");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    //Merge array
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0; i<size;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<size;i++){
            arr3[size+i]=arr2[i];
        }
        System.out.println( "Array 3:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
       
        sc.close();
    }    
}
