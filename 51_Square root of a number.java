class Solution {
    long floorSqrt(long n) {
        // Time Complexity O(logn)
        // Space Complexity O(1)
s       long start = 1, end = n;
        while(start <= end){
            long mid = (start + end) / 2;
            long val = mid * mid;
            if(val <= n) start = mid + 1;
            else end = mid - 1;
        }
        return (long) end;
    }
}
