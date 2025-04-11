import java.util.*;
public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter an alphabet: ");
    String a=sc.next();
    switch(a){
        case "a":
            System.out.print("vowel");
            break;
        case "e":
            System.out.print("vowel");
            break;
        case "i":
            System.out.print("vowel");
            break;
        case "o":
            System.out.print("vowel");
            break;
            case "u":
            System.out.print("vowel");
            break;
        default:
            System.out.print("consonant");
    }

    }
}
