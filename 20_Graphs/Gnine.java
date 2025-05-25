import java.util.ArrayList;

public class Gnine {
    private static boolean dfs(int node, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                if (dfs(it, node, vis, adj) == true) {
                    return true;
                }
                else if (it != parent) return true;
            }
        }
        return false;
    }
    // function to detect cycle in an undirected graph
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, -1, vis, adj) == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
