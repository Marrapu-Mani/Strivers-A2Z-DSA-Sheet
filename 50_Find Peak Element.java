class Solution {
    public int findPeakElement(int[] nums) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int n = nums.length;
        if(n==1) return 0;

        if(nums[0] > nums[1]) return 0; // at index 0 
        if(nums[n-1] > nums[n-2]) return n-1; // at index n-1
        int start = 1, end = n-2;
        while(start <= end){
            int mid = (start + end) / 2;
            if((nums[mid] > nums[mid-1]) && (nums[mid] > nums[mid+1])) return mid;
            else if(nums[mid] > nums[mid-1]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
