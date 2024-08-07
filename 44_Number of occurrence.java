class Solution {
    int count(int[] arr, int n, int x) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        
        // Find starting position
        int starting = -1;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == x){
                starting = mid;
                end = mid - 1;
            } else if(x > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        
        // Find ending position
        int ending = -1;
        if(starting != -1){
            start = 0;
            end = n - 1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(arr[mid] == x){
                    ending = mid;
                    start = mid + 1;
                } else if(x > arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        
        if(starting == -1) return 0;
        return ending - starting + 1;
    }
}
