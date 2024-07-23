class Solution {
    public int missingNumber(int[] nums) {
        // Time Complexity O(n^2)
        // Space Complexity O(n)
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            al.add(nums[i]);
        }

        int i;
        for(i=0; i<=nums.length; i++){
            if(!al.contains(i)){
                break;
            }
        }
        return i;
    }
}
