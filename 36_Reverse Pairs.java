class Solution {
    static int countReversePair(int[] arr, int low, int mid, int high){
        int cnt = 0;
        int j = mid+1;
        for(int i=low; i<=mid; i++){
            while(j <= high && (long)arr[i] > (long)2*arr[j]) j++;
            cnt += (j - (mid + 1));
        }
        return cnt;
    }

    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }
        while(left <= mid) {
            temp.add(arr[left++]);
        }
        while(right <= high) {
            temp.add(arr[right++]);
        }
        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low < high){
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += countReversePair(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    public int reversePairs(int[] nums) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // int count = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if((long)nums[i] > (long)2*nums[j]) count++;
        //     }
        // }
        // return count;


        // Time Complexity O(nlogn)
        // Space Complexity O(n)
        int count = mergeSort(nums, 0, nums.length-1);
        return count;
    }
}
