class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int N = arr.length;
        int M = arr[0].length;
        int maxRowIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < N; ++i) {
            int count = 0;
            for (int j = 0; j < M; ++j) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}
