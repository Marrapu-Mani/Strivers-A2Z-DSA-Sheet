public class Solution {
    public int maxProduct(int[] nums) {
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        // long maxProduct = Long.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++) {
        //     long product = 1;
        //     for(int j = i; j < nums.length; j++) {
        //         product = product * nums[j];
        //         maxProduct = Math.max(maxProduct, product);
        //         System.out.println("i: " + i + ", j: " + j + ", product: " + product + ", maxProduct: " + maxProduct);
        //     }
        // }
        // return (int) maxProduct;


        // Time Complexity O(n)
        // Space Complexity O(1)
        int n = nums.length;
        double prefixProduct = 1, suffixProduct = 1;
        double ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (prefixProduct == 0) prefixProduct = 1;
            if (suffixProduct == 0) suffixProduct = 1;
            prefixProduct *= (double) nums[i];
            suffixProduct *= (double) nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefixProduct, suffixProduct));
        }
        return (int) ans;
    }
}
