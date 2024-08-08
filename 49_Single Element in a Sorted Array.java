class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int n = nums.length;
        if(n == 1) return nums[0];

        int start = 0, end = n-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if((mid == 0) && (nums[mid] != nums[mid+1])) return nums[mid];  // at index 0
            else if((mid == n-1) && (nums[mid] != nums[mid-1])) return nums[mid]; // at index n-1
            else if((nums[mid] != nums[mid-1]) && (nums[mid] != nums[mid+1])) return nums[mid];
            // check for left half
            else if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || 
                (mid % 2 == 1 && nums[mid] == nums[mid-1])){
                start = mid + 1;
            } 
            // check for right half
            else if((mid % 2 == 1 && nums[mid] == nums[mid+1]) ||
                (mid % 2 == 0 && nums[mid] == nums[mid-1])){
                end = mid - 1;
            }
        }
        return -1;
    }
}
