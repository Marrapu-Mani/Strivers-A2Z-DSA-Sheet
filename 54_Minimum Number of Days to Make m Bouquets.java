class Solution {
    static int[] minmax(int[] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        return new int[] {min, max}; 
    }

    static boolean isPossible(int[] arr, int days, int m, int k){
        int count = 0, bouquets = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= days) count++;
            else{
                bouquets += (count / k);
                count = 0;
            }
        }
        bouquets += (count / k);
        if(bouquets >= m) return true;
        else return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int[] minmax = minmax(bloomDay);
        // Time Complexity O((max-min+1)*n)
        // Space Complexity O(1)
        // for(int i = minmax[0]; i<= minmax[1]; i++){
        //     if(isPossible(bloomDay, i, m, k)) return i;
        // }
        // return -1;


        // Time Complexity O(log(max-min+1)*n)
        // Space Complexity O(1)
        int ans = -1;
        int start = minmax[0], end = minmax[1];
        while(start <= end){
            int mid = (start + end) / 2;
            if(isPossible(bloomDay, mid, m, k)){
                ans = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
