class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= k) k++;
            else break;
        }
        return k;
    }
}
