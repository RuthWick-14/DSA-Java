// Find eventual safe states

import java.util.ArrayList;
import java.util.List;

public class Gseventeen {
    private boolean dfsCheck(int node, List<List<Integer>> adj, int vis[], int pathVis[], int check[]){
        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 0;
        //traverse fir adjacent nodes
        for (int it : adj.get(node)) {
            if (dfsCheck(it, adj, vis, pathVis, check) == true) {
                return true;
            }
            //if node had previously visited
            //but it has to be visited on same path
            else if (pathVis[it] == 1) {
                return true;
            }
        }
        check[node] = 1;
        pathVis[node] = 0;
        return false;
    }

    public List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj){
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        int check[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfsCheck(i, adj, vis, pathVis, check);
            }  
        }
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (check[i] == 1) {
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }
}
 