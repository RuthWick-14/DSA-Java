// distance of nearest cell having 1. 0/1 Matrix.
import java.util.LinkedList;
import java.util.Queue;

class Tuples {
    int row;
    int col;
    int distance;

    Tuples(int row, int col, int distance){
        this.row = row;
        this.col = col;
        this.distance = distance; 
    }
}

public class Gten {
    private static int[][] nearest(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Tuples> q = new LinkedList<Tuples>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Tuples(i, j, 0));
                    vis[i][j] = 1;
                }
                else{
                    vis[i][j] = 0;
                }
            }
        }

        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, +1, 0, -1};

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int d = q.peek().distance;
            q.remove();
            dist[r][c] = d;
            for (int i = 0; i < 4; i++) {
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];

                if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.add(new Tuples(nrow, ncol, d + 1));
                }
            }
        }
        return dist;
    }
}
