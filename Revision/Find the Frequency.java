class Solution {
    int findFrequency(int arr[], int x) {
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                c++;
            }
        }
        return c;
    }
}
