import java.util.*;

public class day3 {
public static void main(String [] args){
  /*  int a=5;
     switch (a){
        case 1:
        System.out.println("hello");
        break;
        case 2:
        System.out.println("hii");
        break;
        case 3:
        System.out.println("yo");
        break;
        case 4:
        System.out.println("aloha");
        break;
        case 5:
        System.out.println("namaste");
        break;
        default:
        System.out.println("ye hii hello chodo");
*/
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter first no.: ");
        int a=sc.nextInt();
        System.out.print("Enter second no.:");
        int b=sc.nextInt();
        System.out.print("Enter an operator :");
        String operation=sc.next();
        int c;
        switch (operation){
            case "+":
            c=a+b;
            System.out.print(c);
            break;
            case "-":
            c=a-b;
            System.out.print(c);
            break;
            case "*":
            c=a*b;
            System.out.print(c);
            break;
            case "/":
            c=a/b;
            System.out.print(c);
            break;
            default:
            System.out.print("Invalid Operatior!!!");
        }

}
}

