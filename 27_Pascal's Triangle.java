class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Time Complexity O(n^2)
        // Space Complexity O(n^2)
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                } else{
                    row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
