class GfG
{
    int maxLen(int arr[], int n)
    {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // int len = 0;
        // for(int i=0; i<n ;i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum += arr[j];
        //         if(sum == 0){
        //             len = Math.max(len, j-i+1);
        //         }
        //     }
        // }
        // return len;
        
        
        
        // Time Complexity O(n)
        // Space Complexity O(n)
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0, length = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                length = i + 1;
            }
            
            if(prefixSum.containsKey(sum)){
                length = Math.max(length, i-prefixSum.get(sum));
            } else{
                prefixSum.put(sum, i);   
            }
        }
        return length;
    }
}
