class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Time Complexity O(m+n)
        // Space Complexity O(m+n)

        int i=0,j=0,k=0;
        int[] temp = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                temp[k++] = nums1[i++];
            } else{
                temp[k++] = nums2[j++];
            }
        }
        while(i<m){
            temp[k++] = nums1[i++];
        }
        while(j<n){
            temp[k++] = nums2[j++];
        }

        for(k=0; k<temp.length; k++){
            nums1[k] = temp[k];
        }
    }
}
