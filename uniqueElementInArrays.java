import java.util.Scanner;

class uniqueElementsInArrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("Enter the elements for arr1: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter hte elements for arr2: ");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Unique elements in arrays:");
    //unique elements in arrays
        for(int i=0;i<size;i++){
            boolean unique=true;
            for(int j=0;j<size;j++){
                if(arr1[i]==arr2[j]){
                    unique=false;        
                    break;
                }    
            }
            if(unique)
                System.out.print(arr2[i]+" ");
        }

        sc.close();
    }
}