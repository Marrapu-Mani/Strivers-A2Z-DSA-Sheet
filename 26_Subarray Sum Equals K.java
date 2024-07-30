class Solution {
    public int subarraySum(int[] nums, int k) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // int sum, count=0;
        // for(int i=0; i<nums.length; i++){
        //     sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+= nums[j];
        //         if(sum == k) count++;
        //     }
        // } 
        // return count;



        // Time Complexity O(n)
        // Space Complexity O(n)
        int sum = 0, count = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            if(prefixSum.containsKey(sum-k)){
                count = count + prefixSum.get(sum-k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
