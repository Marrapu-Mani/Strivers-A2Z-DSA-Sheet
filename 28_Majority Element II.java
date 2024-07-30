class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }  

        List<Integer> majority = new ArrayList<>();     // O(1)
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > (nums.length/3)){
                majority.add(entry.getKey());
            }
        }
        return majority;
    }
}
