import java.util.*;
public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
    }
}
