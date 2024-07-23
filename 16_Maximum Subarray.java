class Solution {
    public int maxSubArray(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(1) 
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
