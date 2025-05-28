//NUMBER OF DISTINCT ISLAND

import java.util.ArrayList;
import java.util.HashSet;

class Pair{
    int row;
    int col;

    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

public class Gthirteen {
    private String toStrings(int r, int c){
        return Integer.toString(r) + " " + Integer.toString(c); 
    }

    private void dfs(int r, int c, int[][] vis, int[][] grid, ArrayList<String> vec, int row0, int col0){
        vis[r][c] = 1;
        vec.add(toStrings(r-row0, c-col0));
        int n = grid.length;
        int m = grid[0].length;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int nrow = r + delrow[i];
            int ncol = c + delcol[i];
            if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, vec, row0, col0);
            }
        }
    }

    public int countDistinctIslands(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        HashSet<ArrayList<String>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(i, j, vis, grid, vec, i, j);
                    st.add(vec);
                }
            }
        }
        return st.size();
    }
}
