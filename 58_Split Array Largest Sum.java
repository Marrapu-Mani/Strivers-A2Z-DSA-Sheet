class Solution {
    static int[] maxSum(int[] arr){
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        return new int[] {max, sum};
    }

    static int countSplits(int[] nums,int k,int max){
        int splits = 1, sum = 0;
        for(int num: nums){
            if(sum + num > max){
                splits = splits + 1;
                sum = num;
            } else sum += num;
        }
        return splits;
    }

    // Time Complexity O(log(sum(nums[]) - max(nums[])) * n)
    // Space Compexity O(1)
    public int splitArray(int[] nums, int k) {
        int[] maxSum = maxSum(nums);
        int start = maxSum[0], end = maxSum[1];
        while(start <= end){
            int mid = (start + end) / 2;
            if(countSplits(nums, k, mid) <= k) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
