class Solution {
    public int search(int[] nums, int target) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int n = nums.length;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) return mid;
            else{
                if(nums[start] <= nums[mid]){  // check first half is sorted
                    if(target >= nums[start] && target <= nums[mid]) end = mid - 1;
                    else start = mid + 1; 
                } else{     // check second half is sorted
                    if(target > nums[mid] && target <= nums[end]) start = mid + 1;
                    else end = mid - 1;
                }
            }
        }
        return -1;
    }
}
