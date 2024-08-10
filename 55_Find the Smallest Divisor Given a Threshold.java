class Solution {
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return  max;
    }

    static int divisionSum(int[] arr, int divisor){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += (arr[i] % divisor) == 0 ? arr[i]/divisor : (arr[i]/divisor)+1;
        }
        return sum; 
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = max(nums);
        // Time Complexity O(max(nums[]) * n)
        // Space Complexity O(1)
        // for(int i=1; i<=max; i++){
        //     if(divisionSum(nums, i) <= threshold) return i;
        // }
        // return Integer.MAX_VALUE;


        // Time Complexity O(log(max(nums[])) * n)
        // Space Complexity O(1)
        int start = 1, end = max, ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = (start + end) / 2;
            if(divisionSum(nums, mid) <= threshold){
                ans = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
