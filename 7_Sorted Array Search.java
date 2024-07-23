class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int start = 0, end = N-1, mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == K){
                return 1;
            } else if(K < arr[mid]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
