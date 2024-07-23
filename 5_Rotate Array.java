class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int steps = k % n;
        Stack<Integer> s = new Stack<>();
        for(int i=1; i<=steps; i++){
            s.push(nums[n-i]);
        }
        for(int i=n-1; i>= steps; i--){
            nums[i] = nums[i-steps];
        }

        int stackSize = s.size();
        for(int i=0; i<stackSize; i++){
            nums[i] = s.pop();
        }
    }
}
