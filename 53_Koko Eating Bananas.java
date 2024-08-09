class Solution {
    static int requiredTime(int[] arr, int speed){
        int time = 0;
        for(int i=0; i<arr.length; i++){
            time += Math.ceil((double)arr[i] / (double)speed);
        }
        return time;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // for(int i=1; i<=piles[n-1]; i++){
        //     int requiredTime = requiredTime(piles, i);
        //     if(requiredTime <= h) return i;
        // }
        // return 0;

        // Time Complexity O(nlogn)
        // Space Complexity O(1)
        int start = 1, end = piles[n-1], ans = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(requiredTime(piles, mid) <= h){
                ans = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
