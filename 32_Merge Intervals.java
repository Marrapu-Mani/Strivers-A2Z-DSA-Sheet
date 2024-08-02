class Solution {
    public int[][] merge(int[][] intervals) {
        // Time Complexity O(nlogn)
        // Space Complexity O(n)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merge = new ArrayList<>();
        int[] prevInterval = intervals[0];

        for(int i=1; i<intervals.length; i++){
            int[] interval = intervals[i];
            if(interval[0] <= prevInterval[1]){
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
            } else{
                merge.add(prevInterval);
                prevInterval = interval;
            }
        }
        merge.add(prevInterval);

        return merge.toArray(new int[merge.size()][]);         
    }
}
