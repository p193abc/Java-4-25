import java.util.*;
public class sumUsingMethod {

    static int sum(int a,int b){
        int sum=a+b;
        System.out.print(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
    
}
