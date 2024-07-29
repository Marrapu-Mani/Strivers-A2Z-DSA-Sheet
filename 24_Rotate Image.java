class Solution {
    public void rotate(int[][] matrix) {
        // Time Complexity O(n^2)
        // Space Complexity O(n^2)  //Beats 50.35%
        // int n = matrix.length;
        // int[][] transpose = new int[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         transpose[i][j] = matrix[j][i];
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][n-1-j] = transpose[i][j];
        //     }
        // }


        // Time Complexity O(n^2)
        // Space Complexity O(n^2)  //Beats 68.33%
        int n = matrix.length;
        int[][] copy = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                copy[i][j] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[j][n-1-i] = copy[i][j];
            }
        }
    }
}
