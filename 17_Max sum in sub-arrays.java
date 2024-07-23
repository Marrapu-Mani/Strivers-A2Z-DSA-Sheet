class Solution {
    public int pairWithMaxSum(List<Integer> arr) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // int smallest, secondSmallest, maxScore = Integer.MIN_VALUE;
        // for(int i=0; i<arr.size(); i++){
        //     smallest = arr.get(i);
        //     secondSmallest = Integer.MAX_VALUE;
        //     for(int j=i+1; j<arr.size(); j++){
        //         if(arr.get(j) < smallest){
        //             secondSmallest = smallest;
        //             smallest = arr.get(j);
        //         }  else if(arr.get(j) != smallest && arr.get(j) < secondSmallest){
        //             secondSmallest = arr.get(j);
        //         } 
        //         maxScore = Math.max(maxScore, smallest+secondSmallest);
        //     }
        // }
        // return maxScore;


      
        // Time Complexity O(n)
        // Space Complexity O(1)
        int maxScore = arr.get(0) + arr.get(1);
        for(int i=1; i<arr.size()-1; i++){
            maxScore = Math.max(maxScore, arr.get(i)+arr.get(i+1));
        }
        return maxScore;
    }
}
