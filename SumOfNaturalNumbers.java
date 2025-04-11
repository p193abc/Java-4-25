import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int i=0,sum=0;
        while(i<n) {
             sum=sum+i;
            System.out.print(sum+" ");
            i++;
        }
    }
}
