import java.util.*;
public class positiveNegitiveOrZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n>0)
            System.out.print("Number is POSITIVE !!!");
        else if(n<0)
            System.out.print("Nummber is NEGETIVE !!!");
        else
            System.out.print("Number is ZERO !!!");
    }
}
