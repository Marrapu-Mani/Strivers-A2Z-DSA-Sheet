class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        // int n = nums.length;
        // int starting = -1, ending = -1;
        // int start = 0, end = n - 1;
        // while(start <= end){
        //     int mid = (start + end) / 2;
        //     if(target == nums[mid]){
        //         starting = ending = mid;
        //         int left = mid-1, right = mid+1;
        //         while(left >= 0 && nums[left] == target){
        //             starting = left;
        //             left--;
        //         }
        //         while(right < n && nums[right] == target){
        //             ending = right;
        //             right++;
        //         }
        //         break;
        //     } 
        //     else if(target > nums[mid]) start = mid + 1;
        //     else end = mid - 1;
        // }
        // return new int[] {starting, ending};


        // Time Complexity O(logn)
        // Space Complexity O(1)
        // Find starting position
        int n = nums.length;
        int starting = -1;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                starting = mid;
                end = mid - 1;
            } else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        // Find ending position
        int ending = -1;
        if(starting != -1){     // if there is no starting position, then there is no ending position also 
            start = 0;
            end = n - 1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(nums[mid] == target){
                    ending = mid;
                    start = mid + 1;
                } else if(target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return new int[] {starting, ending};
    }
}
