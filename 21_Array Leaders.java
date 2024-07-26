class Solution {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Time Complexity O(n)
        // Space Comlexity O(n)
        int[] suffixMax = new int[n];
        suffixMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffixMax[i] = Math.max(arr[i], suffixMax[i+1]);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] >= suffixMax[i]){
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}
