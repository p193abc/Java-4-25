import java.util.Scanner;

public class commonBetweenTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of arrays:");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        int [] arr2=new int[size];
        System.out.println("Enter elements of arr1: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println();
        
        System.out.print("Enter elements for arr2: ");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println();
    //Common elements in arrays
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr1[i]==arr2[j])
                    System.out.print(arr2[j]+" ");
            }
        }


        sc.close();
    }
}
