<<<<<<< HEAD
import java.util.*;

public class array2d {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.print("Enter values for array: ");
=======
import java.util.Scanner;
public class array2d {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int [3][3];
        System.out.println("Enter elements of array:");
>>>>>>> 36570960099f0e48edf9de3aa03b6b3f978c350f
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Element ["+i+"]"+"["+j+"] :");
                arr[i][j]=sc.nextInt();
            }
        }
<<<<<<< HEAD
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\nEnter the value for X: ");
        int x=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==x){
                    System.out.println("The index of X is: ["+i+"]"+"["+j+"]" );
=======
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j  ]+" ");
            }System.out.println();
        }
        
        System.out.print("Enter a number  x:");
        int x=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]== x) {
                    System.out.print("X is present at index:"+i+" "+j+"\n");
>>>>>>> 36570960099f0e48edf9de3aa03b6b3f978c350f
                    break;
                }
            }
        }
<<<<<<< HEAD
    
    }    
}
=======
        
        
    }
}    
>>>>>>> 36570960099f0e48edf9de3aa03b6b3f978c350f
