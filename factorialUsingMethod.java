import java.util.*;
public class factorialUsingMethod {

    int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=i*sum;
        }
        System.out.print(sum);
        return sum;
    }

    public static void main(String[] args) {
        factorialUsingMethod obj=new factorialUsingMethod();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        obj.fact(n);
        sc.close();
    }
}
