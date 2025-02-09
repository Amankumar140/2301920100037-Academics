class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                swap(arr, i,j);
                j++;
            }
        }
        
    }
    
    public static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
