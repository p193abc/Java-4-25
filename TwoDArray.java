import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={12,5,87};
        int[] arr2={2,45,55};
        int[] sum=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(sum[i]+" ");
        }

        
    }
}
