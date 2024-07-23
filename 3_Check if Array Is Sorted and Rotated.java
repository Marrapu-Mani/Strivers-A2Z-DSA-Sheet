class Solution {
    public boolean check(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        int l = nums.length, count = 0;
        for(int i=0; i<l; i++){
            int currentIdx = i % l;
            int nextIdx = (i+1) % l;
            if((nums[currentIdx] - nums[nextIdx] > 0)) count++;
        }
        if(count > 1){
            return false;
        }
        return true;
    }
}
