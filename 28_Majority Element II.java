class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Time Complexity O(n)
        // Space Complexity O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }  

        // List<Integer> majority = new ArrayList<>();     // O(1)
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(entry.getValue() > (nums.length/3)){
        //         majority.add(entry.getKey());
        //     }
        // }
        // return majority;



        // Time Complexity O(n)
        // Space Complexity O(1)
        int cnt1=0, cnt2=0, ele1=Integer.MIN_VALUE, ele2=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                cnt1 = 1;
                ele1 = nums[i];
            } else if(ele1 == nums[i]){
                cnt1++;
            } else if(cnt2 == 0){
                cnt2 = 1;
                ele2 = nums[i];
            } else if(ele2 == nums[i]){
                cnt2++;
            } else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> majority = new ArrayList<>();
        int check1 = 0, check2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == ele1) check1++;
            if(nums[i] == ele2) check2++;
        }
        if(check1 > nums.length/3) majority.add(ele1);
        if(check2 > nums.length/3) majority.add(ele2);

        return majority;
    }
}
