import java.util.*;
public class sumOfElementsInMatrix {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the elements for Matrix:");
        int[][] arr=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("Element ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.print("sum="+sum);
      
							  sc.close();
    }
    
}