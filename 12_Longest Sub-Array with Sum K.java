class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
        // Time Complexity O(n^2)
        // Space Complexity O(n)
        // int[] prefixSum = new int[N];
        // prefixSum[0] = A[0];
        // for(int i=1; i<N; i++){
        //     prefixSum[i] = prefixSum[i-1] + A[i];
        // }
        
        // int sum, length, maxLength=0;
        // for(int i=0; i<N; i++){
        //     for(int j=i; j<N; j++){
        //         if(i==0){
        //             sum = prefixSum[j];
        //         } else{
        //             sum = prefixSum[j] - prefixSum[i-1];
        //         }

        //         if(sum == K){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }
        //     }
        // }
        // return maxLength;
        
        
        
        // Time Complexity O(n)
        // Space Complexity O(n)
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0, maxLen = 0, rem = 0;
        for(int i=0; i<N; i++){
            sum+= A[i];
            if(sum == K){
                maxLen = Math.max(maxLen, i+1);
            }
            rem = sum - K;
            if(prefixSum.containsKey(rem)){
                maxLen = Math.max(maxLen, i-prefixSum.get(rem));
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
        }
        return maxLen;
    }
}
