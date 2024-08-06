class Solution {
    static int findFloor(long arr[], int n, long x) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int start=0, end=n - 1, mid=0;
        while(start<=end){
            mid = (start + end) / 2;
            if(arr[mid] == x){
                return mid;
            }
            else if(x < arr[mid]){
                end = mid - 1;
            }
            else{   //x > arr[mid]
                start = mid + 1;
            }
        }
        return end;
    }
}
