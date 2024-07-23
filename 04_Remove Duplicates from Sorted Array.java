class Solution {
    public int removeDuplicates(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        Stack<Integer> s = new Stack<>();
        s.push(Integer.MIN_VALUE);
        for(int i=0; i<nums.length; i++){
            if(s.peek() != nums[i]){
                s.push(nums[i]);
            }
        }

        int k = s.size()-1;
        for(int i=k-1; i>=0; i--){
            nums[i]=s.pop();
        }

        return k;
    }
}
