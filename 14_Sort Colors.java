class Solution {
    public void sortColors(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        int[] frequency = new int[3];
        for(int i=0; i<nums.length; i++){
            frequency[nums[i]]++;
        }
        
        int k = 0;
        for(int i=0; i<frequency.length; i++){
            for(int j=1; j<=frequency[i]; j++){
                nums[k++] = i;
            }
        }
    }
}
