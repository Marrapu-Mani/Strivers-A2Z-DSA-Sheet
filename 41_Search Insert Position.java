class Solution {
    public int searchInsert(int[] nums, int target) {
        // Space Complexity O(logn)
        // Time Complexity O(1)
        int start=0, end=nums.length - 1, mid=0;
        while(start<=end){
            mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{   //target > nums[mid]
                start = mid + 1;
            }
        }

        if(target < nums[mid]){
            return mid;
        } else{
            return mid + 1;
        }
    }
}
