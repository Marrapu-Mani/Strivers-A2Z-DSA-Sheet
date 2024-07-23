class Solution {
    public void moveZeroes(int[] nums) { 
        // Time Complexity O(n)
        // Space Complexity O(1)       
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }

        for( ; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
