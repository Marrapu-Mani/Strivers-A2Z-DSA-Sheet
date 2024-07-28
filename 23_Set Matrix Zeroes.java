class Solution {
    public void setZeroes(int[][] matrix) {
        // Time Complexity O(m*n)
        // Space Complexity O(m+n)
        // HashSet<Integer> zeroRows = new HashSet<>();
        // HashSet<Integer> zeroColumns = new HashSet<>();
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(matrix[i][j] == 0){
        //             zeroRows.add(i);
        //             zeroColumns.add(j);
        //         }
        //     }
        // }

        // for(int row: zeroRows){
        //     for(int i=0; i<matrix[row].length; i++){
        //         matrix[row][i] = 0;
        //     }
        // }

        // for(int col: zeroColumns){
        //     for(int i=0; i<matrix.length; i++){
        //         matrix[i][col] =   0;       
        //     }
        // }



        // Time Complexity O(m*n)
        // Space Complexity O(1)
        boolean firstRow = false, firstCol = false;
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0) firstRow = true;
        }
        for(int j=0; j<matrix.length; j++){
            if(matrix[j][0] == 0) firstCol = true;
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int j=0; j<matrix.length; j++){
                matrix[j][0] = 0;
            }
        }
    }
}
