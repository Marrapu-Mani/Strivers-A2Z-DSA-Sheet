class Solution {
    public int print2largest(List<Integer> arr) {
        // Time Complexity O(n)
        // Space Complexity O(1)
        int largest = arr.get(0), secondLargest = -1;
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i) > largest){
                secondLargest = largest;
                largest = arr.get(i);
            } else if(arr.get(i) != largest && arr.get(i) > secondLargest){
                secondLargest = arr.get(i);
            }
        }
        
        return secondLargest;
    }
}
