public class Geleven {
    private static void dfs(int row, int col, int[][] vis, char[][] matrix, int[] delrow, int[] delcol) {
        int n = matrix.length;
        int m = matrix[0].length;

        // check for top, right , bottom, left
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && matrix[nrow][ncol] == 'O') {
                dfs(nrow, ncol, vis, matrix, delrow, delcol);
            }
        }
    }

    public static char[][] fill(int n, int m, char[][] matrix) {
        int delrow[] = { -1, 0, +1, 0 };
        int delcol[] = { 0, +1, 0, -1 };
        int vis[][] = new int[n][m];

        //traverse first and last row
        for (int j = 0; j < m; j++) {
            // for first row
            if (vis[0][j] == 0 && matrix[0][j] == 'O') {
                dfs(0, j, vis, matrix, delrow, delcol);
            }

            //for last row
            if (vis[n-1][j] == 0 && matrix[n-1][j] == 'O') {
                dfs(n-1, j, vis, matrix, delrow, delcol);
            }
        }

        //traverse first and last column
        for (int i = 0; i < n; i++) {
            // for first column
            if (vis[i][0] == 0 && matrix[i][0] == 'O') {
                dfs(i, 0, vis, matrix, delrow, delcol);
            }
            //for last column
            if (vis[i][m-1] == 0 && matrix[i][m-1] == 'O') {
                dfs(i, m-1, vis, matrix, delrow, delcol);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && matrix[i][j] == 'O') {
                    matrix[i][j] = 'X';
                }
            }
        }
        return matrix;
    }
}
