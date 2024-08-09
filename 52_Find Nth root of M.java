class Solution
{
    public int NthRoot(int n, int m)
    {
        // Time Complexity O(nlogm)
        // Space Complexity O(1)
        int start = 1, end = m;
        while(start <= end){
            int mid = (start + end) / 2;
            long power = 1;
            for(int i=1; i<=n; i++){
                power *= mid;
                if (power > (long) m) break;
            }
            if(power == (long) m) return mid;
            else if(power < (long) m) start = mid + 1;
            else end = mid - 1; // power > (long) m
        }
        return -1;
    }
}
