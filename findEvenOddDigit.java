
public class findEvenOddDigit {
    
    public static void main(String[] args) {
        int n=1234;
        System.out.println("n="+n);
     //int   a;
        while(n>0){
            int a=n%10;
            if(a%2==0)
                System.out.print(a+"=even\n");
            else
                System.out.print(a+"=odd\n");
             n=n/10;     
        }  
        
    }
    
}