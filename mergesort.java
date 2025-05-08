public class mergesort {
    public static void sort(int[] arr,int left,int right) {
        if(left>=right)
            return;
        int mid= left +(right-left)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);

        
        merge(arr,left,mid,right);
 
    } 
    public static void merge(int[]arr,int left,int mid,int right) {
       int [] arr2=new   int[right-left+1];
       int i=left,j=mid+1,k=0;
       
       while(i<=mid&&j<=right){
        if(arr[i]<=arr[j]){
            arr2[k]=arr[i];
            i++;
        }else{
            arr2[k]=arr[j];
            j++;
        }k++;
       }
       while(i<=mid){
        arr2[k]=arr[i];
        i++;k++;
       }
       while(j<=right){
        arr2[k]=arr[j];
        j++;k++;
       }
     
       for (i=0,j=left;i<arr2.length;i++,j++){
        arr[j]=arr2[i];
       }
      
    }
    public static void main(String[] args) {
        int[] arr={8,4,6,2,47,9,1,3};
        System.out.println("Before sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr, 0, arr.length-1);
        int n=arr.length;
        System.out.println();
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
       System.out.print("\nArray has been sorted ");
    }
}