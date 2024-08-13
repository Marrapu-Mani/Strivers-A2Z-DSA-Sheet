class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] <= k) k++;
        //     else break;
        // }
        // return k;


        // Time Complexity O(logn)
        // Space Complexity O(1)
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k) start = mid + 1;
            else end = mid - 1;
        }
        return k + end + 1;
    }
}
