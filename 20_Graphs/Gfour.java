import java.util.ArrayList;

public class Gfour {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adjLS, int vis[]){
        vis[node] = 1;
        for(int it : adjLS.get(node)){
            if (vis[it] == 0) {
                dfs(it, adjLS, vis);
            }
        }
    }

    public static int numberOfProvince (ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<ArrayList<Integer>> adjLS = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++) {
            adjLS.add(new ArrayList<Integer>());
        }

        //to change adjacency matrix to list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i!=j) {
                    adjLS.get(i).get(j);
                    adjLS.get(j).get(i);
                }
            }
        }

        int vis[] = new int[V];
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, adjLS, vis);
            }
        }
        return cnt;
    }
}

