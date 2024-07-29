class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Time Complexity O(m*n)
        // Space Complexity O(m*n)
        List<Integer> spiral = new ArrayList<>();
        int startRow = 0, endRow = matrix.length-1, startCol = 0, endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                spiral.add(matrix[startRow][i]);
            }
            startRow++;
            //right
            for(int i=startRow; i<=endRow; i++){
                spiral.add(matrix[i][endCol]);
            }
            endCol--;
            //bottom
            if(startRow<=endRow){
                for(int i=endCol; i>=startCol; i--){
                    spiral.add(matrix[endRow][i]);
                }
            }
            endRow--;
            //left
            if(startCol<=endCol){
                for(int i=endRow; i>=startRow; i--){
                    spiral.add(matrix[i][startCol]);
                }
            }
            startCol++;
        }
        return spiral;
    }
}
