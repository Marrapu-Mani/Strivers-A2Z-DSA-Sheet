class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        // Time Complexity O(n)
        // Space Complexity O(1)
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return max;
    }
}
