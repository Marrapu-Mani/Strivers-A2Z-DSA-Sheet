class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        // Time Complexity O(n^3)
        // Space Complexity O(1) 
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer> list = new ArrayList<>();  //O(1)
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);

        //                 Collections.sort(list);
        //                 if(!resultList.contains(list)){
        //                     resultList.add(list);                        
        //                 }
        //             }
        //         }
        //     }
        // }

        // Time Complexity O(n^2)
        // Space Complexity O(n)
        // for(int i=0; i<nums.length; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j=i+1; j<nums.length; j++){
        //         int third = -(nums[i] + nums[j]);
        //         if(set.contains(third)){        // HashSet uses a hash table for storage, which allows for constant-time complexity for most operations, including contains
        //             List<Integer> list = new ArrayList<>();  
        //             list.add(nums[i]);
        //             list.add(nums[j]);
        //             list.add(third);

        //             Collections.sort(list);
        //             if(!resultList.contains(list)){
        //                 resultList.add(list);                        
        //             }
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // return resultList;

        // Time Complexity O(n^2)
        // Space Complexity O(1)
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                } else if(sum > 0){
                    k--;
                } else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    resultList.add(list);

                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return resultList;
    }
}
