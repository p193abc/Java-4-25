import java.util.*;
public class divisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if (n%5==0)
           if(n%11==0)
            System.out.print("number is divisible by 5 and 11...");
           
            else
            System.out.print("Number is NOT divisible by 5 and 11...");
    }
}
