import java.util.*;
public class Marks {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //PRINT MARKS   
        System.out.print("Enter the size of array: ");
        int size= sc.nextInt();
        int[] marks = new int[size];
        
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
		System.out.println();
        for(int i=0; i<size;i++){
            System.out.println(marks[i]);
        }
    }
    
}