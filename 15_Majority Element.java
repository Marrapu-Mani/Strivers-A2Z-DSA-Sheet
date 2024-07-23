class Solution {
    public int majorityElement(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int half = nums.length / 2;
        for(Integer key: map.keySet()){
            if(map.get(key) > half){
                return key;
            }
        }
        
        return -1;
    }
}
