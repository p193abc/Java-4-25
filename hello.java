import java.util.Scanner;
class hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("your number is"+a);
        sc.close();
    }
}