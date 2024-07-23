class Solution {
    public int singleNumber(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        int value;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == 1 ){
                return nums[i];
            } 
        }

        return -1;
    }
}