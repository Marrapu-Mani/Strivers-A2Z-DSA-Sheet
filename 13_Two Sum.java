class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // Time Complexity O(n^2)
        // // Space Complexity O(1)
        // int i, j;
        // for (i = 0; i < nums.length; i++) {
        //     for (j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[0];

        // Time Complexity O(n)
        // Space Complexity O(n)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target-nums[i])){
                return new int[] {i, hm.get(target-nums[i])};
            } else{
                hm.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
