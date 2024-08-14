class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Time Complexity O(n + m)
        // Space Complexity O(n + m)
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[n + m];
        while(i < n && j< m){
            if(nums1[i] <= nums2[j]){
                mergedArray[k++] = nums1[i++];
            } else{
                mergedArray[k++] = nums2[j++];
            }
        }

        while(i < n){
            mergedArray[k++] = nums1[i++];
        }
        while(j < m){
            mergedArray[k++] = nums2[j++];
        } 

        if((mergedArray.length) % 2 == 0){
            int mid = mergedArray.length / 2;
            return ((double) (mergedArray[mid-1] + mergedArray[mid]) / 2);
        } else{
            int mid = mergedArray.length / 2;
            return mergedArray[mid];
        }
    }
}
