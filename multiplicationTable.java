import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int p=0;
        for(int i=1;i<=10;i++){
            p=n*i;
            System.out.println(n+"x"+i+"="+p);
    }
    sc.close();
    }
}
