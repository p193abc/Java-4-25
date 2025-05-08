public class recursiveFunction1 {

    public static void fibonachi(int a,int b,int n) {
        if(n==0){
            return;
        }        
        int c=a+b;
        System.out.println(c);
        fibonachi(b, c, n-1);
   
    }
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        System.out.print(a+"\n"+b+"\n");
        int n=7;
        fibonachi(a, b, n-2);
    }
}




