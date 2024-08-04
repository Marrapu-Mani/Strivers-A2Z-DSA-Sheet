class Solution {
    static long merge(long[] arr, int low, int mid, int high) {
        List<Long> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        long cnt = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
                cnt += (mid + 1 - left);
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
        return cnt;
    }

    static long mergeSort(long[] arr, int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    static long inversionCount(long arr[], int n) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // long count = 0;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] > arr[j]) count++;
        //     }
        // }   
        // return count;


      
        // Time Complexity O(nlogn)
        // Space Complexity O(n)
        long count = mergeSort(arr, 0, n-1);
        return count;
    }
}
