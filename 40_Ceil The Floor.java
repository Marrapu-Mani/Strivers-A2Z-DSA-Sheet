class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                floor = arr[i];
                ceil = arr[i];
            }
            else if(arr[i] < x && arr[i] > floor){ 
                floor = arr[i];
            }
            else if(arr[i] > x && arr[i] < ceil){
                ceil = arr[i];
            }
        }
        if(floor == Integer.MIN_VALUE) floor = -1;
        if(ceil == Integer.MAX_VALUE) ceil = -1;
      
        return new int[] {floor, ceil};
    }
}
