class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        int res_row = 0;
        int res_col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[res_row][res_col] = mat[i][j];
                res_col++;
                if (res_col == c) {
                    res_col = 0;
                    res_row++;
                }
            }
        }
        return res;
    }
}
