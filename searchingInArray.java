import java.util.Scanner;
public class searchingInArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
  
        
      //FIND X IN USER DEFINED ARRAY
        
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter elements.of array: ");
        //input
        for(int i=0;i<size;i++){
            System.out.print("element "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        //print
        for(int i=0;i<size;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        //searching x
        System.out.print("Enter value of x: ");
        int x =sc.nextInt();
        for(int i=0;i<size;i++){
            if(array[i]== x){
                System.out.print("index no. :"+i);
                break;}
            
        }
        
    }
    
}