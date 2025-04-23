
public class mergeTwoArrays {
    
    public static void main(String[] args) {
     /*   int n=1234;
        System.out.println("n="+n);
     //int   a;
        while(n>0){
            int a=n%10;
            if(a%2==0)
                System.out.print(a+"=even\n");
            else
                System.out.print(a+"=odd\n");
             n=n/10;     
        }*/  
        int[]arr1={1,2,3,4};
        System.out.print("Array 1: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        int[]arr2={2,3,4,5}; 
        System.out.print("Array 2: ");        
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+ " ");
        }
        int[]arr3=new int[arr1.length+arr2.length];
        
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.print("\nMerged array: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    
}