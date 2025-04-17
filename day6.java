import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();

    //Print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    //Print reverse of array
        System.out.println("Reversed array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    //Print sum of all inputs    
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("\nsum= "+sum);

    //Print maximum no.
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("max= "+max);

    //Print no. of even and odd value
        int evenCount=0 , oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("no. of even values= "+evenCount);
        System.out.println("no. of odd values= "+oddCount);

    //take input and find if it is present in array
        System.out.print("Enter no. to find = ");
        int no=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==no){
                System.out.println("Number FOUND!!!");
                break;
            }
            else{
                System.out.println("Number NOT FOUND!!!");
                break;
            }
        }

        sc.close();
    }
}
