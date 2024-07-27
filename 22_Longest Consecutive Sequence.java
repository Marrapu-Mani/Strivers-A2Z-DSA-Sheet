class Solution {
    public int longestConsecutive(int[] nums) {
        // Time Complexity O(nlogn)
        // Space Complexity O(1)
        // if(nums.length == 0 || nums.length == 1){
        //     return nums.length;
        // }

        // Arrays.sort(nums);
        // int longest = 1, current=0, lastElement=Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]-1 == lastElement){
        //         current++;
        //     } else if(nums[i] != lastElement){
        //         current = 1;
        //     }
        //     lastElement = nums[i];
        //     longest = Math.max(longest, current);
        // }
        // return longest;

        // Time Complexity O(n)
        // Space Complexity O(1)
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 1, current = 0;
        for(int ele: set){
            if(!set.contains(ele-1)){
                current = 1;
                int x = ele;
                while(set.contains(x + 1)){
                    current++;
                    x+=1;
                }
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }
}
