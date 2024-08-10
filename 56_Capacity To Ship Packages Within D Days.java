class Solution {
    static int[] maxSum(int[] arr){
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        } 
        return new int[] {max, sum};
    }

    static int requiredDays(int[] wt, int capacity){
        int days = 1, load = 0;
        for(int i=0; i<wt.length; i++){
            if(load + wt[i] > capacity){
                days = days + 1;
                load = wt[i];
            } else{
                load += wt[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int[] maxSum = maxSum(weights);
        // Time Complexity O((sum(nums[]) - max(nums[]) * n) == n^2
        // Space Complexity O(1)
        // for(int i = maxSum[0]; i<=maxSum[1]; i++){
        //     if(requiredDays(weights, i) <= days) return i;
        // }
        // return Integer.MAX_VALUE;


        // Time Complexity O(log(sum(nums[]) - max(nums[]) * n) == n^2
        // Space Complexity O(1)
        int start =  maxSum[0], end = maxSum[1], ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = (start + end) / 2;
            if(requiredDays(weights, mid) <= days){
                ans = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
