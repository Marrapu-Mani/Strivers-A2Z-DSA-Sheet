class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Time Complexty O(n)
        // Space Complexity O(1)
        int max = 0, current = 0; 
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(current > max){
                    max = current;
                }
                current = 0;
            } else{
                current++;
            }
        }
        if(current > max){
            max = current;
        }
        return max;
    }
}
