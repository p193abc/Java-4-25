import java.util.*;
public class rowWiseSum {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1[][]=new int[3][3];
        System.out.println("Enter elements for array:");  
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array:") ;       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }System.out.println();
        }    
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                sum=sum+arr1[j][i];
            } System.out.println("sum of columns "+(i+1)+":"+sum);
            sum=0;
        }
        
        
        sc.close();
    }
    
}