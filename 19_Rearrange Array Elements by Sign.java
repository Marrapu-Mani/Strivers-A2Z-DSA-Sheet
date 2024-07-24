class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        // int[] positives = new int[(nums.length)/2];
        // int[] negatives = new int[(nums.length)/2];
        // int posIndex = 0, negIndex = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > 0){
        //         positives[posIndex++] = nums[i];
        //     } else{
        //         negatives[negIndex++] = nums[i];
        //     }
        // }

        // for(int i=0; i<nums.length; i++){
        //     if(i % 2 == 0){
        //         nums[i] = positives[i/2];
        //     } else{
        //         nums[i] = negatives[i/2];
        //     }
        // }

        // return nums;

        // Time Complexity O(n)
        // Space Complexity O(n)
        int[] ans = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for(int num:nums){
            if(num > 0){
                ans[posIndex] = num;
                posIndex += 2;
            } else{
                ans[negIndex] = num;
                negIndex += 2;
            }
        }
        return ans;
    }
}
