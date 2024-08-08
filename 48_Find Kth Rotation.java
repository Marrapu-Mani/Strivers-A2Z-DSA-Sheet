class Solution {
    public int findKRotation(List<Integer> arr) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
        int n = arr.size(), min = Integer.MAX_VALUE, pos = -1;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr.get(start) <= arr.get(mid)){ // first half is sorted
                if(arr.get(start) < min){
                    min = arr.get(start);
                    pos = start;
                }
                start = mid + 1;    // eliminate first half
            } else{     // second half is sorted
                if(arr.get(mid) <= min){
                    min = arr.get(mid);
                    pos = mid;
                }
                end = mid - 1;      // eliminate second half
            }
        }
        return pos;
    }
}
