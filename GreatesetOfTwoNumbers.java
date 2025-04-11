import java.util.*;
public class GreatesetOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.print("First no. is greater");
        else
            System.out.print("Second no. is greater");
    }
}
